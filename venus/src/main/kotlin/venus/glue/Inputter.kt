package venus.glue

/** The Inputter inputs characters from the standard input, reading them a line
 *  at a time.  */
internal object Inputter {

    /** Contains current line of input. */
    private val buffer: StringBuilder = StringBuilder()
    /** Index in buffer of next character to deliver, or -1 if the last input
     *  line is exhausted. */
    private var bufferPntr: Int = -1

    /** Clear the internal buffer and read a line from the standard input into
     *  it.  Returns the length of the line, minus the terminating newline, or
     *  -1 on end of file. */
    internal fun bufferLine(): Int {
        var line = readLine()
        if (line == null) {
            bufferPntr = -1
            return -1
        } else {
            bufferPntr = 0
            buffer.clear()
            buffer.append(line)
            return buffer.length
        }
    }

    /** Return the next byte (unsigned) from the buffer, refilling as
    *   needed, or -1 on end of file. */
    internal fun nextByte(): Int {
        if (bufferPntr == -1) {
            if (bufferLine() == -1) {
                return -1
            }
        }
        if (bufferPntr >= buffer.length) {
            bufferPntr = -1
            return '\n'.toInt()
        } else {
            bufferPntr += 1
            return buffer.get(bufferPntr - 1).toInt()
        }
    }
        
}
