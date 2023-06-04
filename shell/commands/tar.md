# `tar` command

Used to create or extract compressed files

## Options

- `c` or `--create`
- `f` or `--file`
- `v` or `--verbose`
- `x` or `--extract`
- `z`, `--gunzip` or `--gzip`: (compress only)

## Examples

### Extract to a specific location in verbose mode

`tar -xvf`

### Compress files to a specific location using gzip in verbose mode

- `tar -czvf out.tar.gz source.c source.h`
- `tar -czvf out.tgz source.c source.h`