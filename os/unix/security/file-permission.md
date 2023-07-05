# File permission

File permission is a [Discretionary Access Control (DAC)](dac.md)implementation. Unix-like OSes use file permissions to control who can access or modify files.

There are three permission sets in order:
- Owner: file owner
- Group: group owner
- Others: everyone else

Each set has three permissions (three-bit flag) in order:
- `r`: read
- `w`: write
- `x`: execute

In general, we can represent permissions of a file using 9 bits `0b000000000` with each three-bits are permission of a set. For example,
- `0b100`: read-only (4)
- `0b010`: write-only (2)
- `0b001`: execute-only (1)
- `0b110`: read-write (6)
- `0b101`: write-execute (5)
- `0b011`: read-execute (3)
- `0b111`: all (7)

Thus, 
- `777` (`0b111111111`) means full permissions grants for all sets
- `700` (`0b111000000`) means the owner has full permissions while the group and others have no permission
- `666` (`0b110110110`) means all sets have read-write permissions
- `644` (`0b110100100`) means the owner has read-write permissions while the group and others have read-only permission

## File permission commands

### View permissions of a file or directory

`ls -l [file]`

### Change permissions of a file

`chmod mode file ...`

### Change the owner of a file

`chown [-R] owner file ...`

### Change the group of a file

`chgrp [-R] group file ...`