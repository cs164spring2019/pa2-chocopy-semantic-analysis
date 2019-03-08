# Runtime support function abort (does not return).
  mv t0, a0                                # Save exit code in temp
  li a0, 4                                 # Code for ecall: print_string
  ecall                                    # Print error message in a1
  li a1, 10                                # Load newline character
  li a0, 11                                # Code for ecall: print_char
  ecall                                    # Print newline
  mv a1, t0                                # Move exit code to a1
  li a0, 17                                # Code for ecall: exit2
  ecall                                    # Exit with code
abort_17:                                  # Infinite loop
  j abort_17                               # Prevent fallthrough
