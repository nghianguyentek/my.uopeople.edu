# Vim (Vi IMproved) Text Editor

## Modes

- [Normal mode](#normal-mode): used to type commands
- [Insert mode](#insert-mode): used to type texts

### Mode switching

- From `Normal` mode, press `i` to switch into `Insert` mode
- From `Insert` mode, press `Esc` to back to `Normal` mode

## Normal Mode

### Exit

- `q[!]`

### Save and exit

- `ZZ`

### Navigation keys

- `h`: move left one column
- `l`: move right one column
- `k`: move up one line at the same column index
- `j`: move down one line at the same column index

### Delete characters

- `[count]x`: delete the character at the cursor position
- `dd`: delete a line

### Replace

- `r`

### Undo and redo

- `u`: undo
- `CTRL+R`: redo

## Insert mode

## Environment variables

### `$VIMRUNTIME`

Its value is the Vim runtime directory path.