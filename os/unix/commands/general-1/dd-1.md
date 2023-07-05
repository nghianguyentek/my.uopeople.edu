# `dd` (1) Command

*Since AT&T Unix Version 5*

Convert and copy a file

*This command cannot be used to copy CD drives, see [cdrdao](cdrdao-1.md) instead.*

## Examples

### Create an image file from a USB

```sh
dd if=/dev/sdb of=my_usb.img
```

### Create an image file from a CD drive

```sh
dd if=/dev/cdrom of=my_cd.iso
```