# venus - JVM branch

This branch should always be ahead of `master`. It contains some changes from `master` necessary to compile Venus to the JVM.

## Create venus JAR

Run `gradle clean jar` from root.

## Keep it synced

Remember 1: If there is a need to add any new feature to Venus in general (e.g. its assembler or simulator), please make the changes in `master` and then merge them in to `jvm`. Do not make the changes in `jvm` directly.

Remember 2: If there are any changes to `master`, please run `git merge master` from this branch.
