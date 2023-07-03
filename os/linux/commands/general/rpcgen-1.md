# `rpcgen` (1) Command

An RPC protocol compiler

*This command required either [cc(1)]() or [cpp(1)]()*

## Installation

`rpcgen` may not be packaged in Linux distros by default. So if the command not found, we have to install it.

### Ubuntu Server

```sh
sudo apt install libc-dev-bin
```

## Examples

### Generate C codes from an IDL file

```sh
rpcgen -a %idl-file%
```