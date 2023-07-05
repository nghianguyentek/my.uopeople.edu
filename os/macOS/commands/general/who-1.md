# `who(1)`

Display who is on the system

## Syntax

```sh
who [-aHmqsTu] [am I] [file]
```

## Output format

### Default output columns

- login-name (NAME)
- [tty](../../../tty.md)-name (LINE)
- login-time (TIME)
- remote-host (FROM)

## Examples

### Display the list of current logged in users with headings

```sh
who -H
```
