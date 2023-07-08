# `cp(1)`

Copy files

## Syntax

`cp [-f | -i | -n] source-file-path target-path`

where:

- `target-path`: a directory path or a file path

## Examples

### Copy a file to a new location, prompt if target file exists

`cp -i source-file-path target-path`

### Copy a file to a new location only if it doesn't exist

`cp -n source-file-path target-path`