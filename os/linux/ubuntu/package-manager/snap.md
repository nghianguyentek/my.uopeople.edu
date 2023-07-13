# Snap Package Manager

Snap is a newer package manager on Ubuntu than the traditional APT (Advanced Package Tool).

## Examples

### Display additional verions of a package

`snap info package-name`

### Install a package with the latest/stable version

`sudo snap install package-name`

### Install a the latest/stable version of a package in classic confinement mode

`sudo snap install package-name --classic`

### List the changes

`snap changes`