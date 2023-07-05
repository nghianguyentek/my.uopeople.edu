# Pseudo-Terminal Slave (pts)

*Pseudo means simulated or emulated*

A pseudo-terminal is a software emulating a physical [TTY](tty.md).

In Unix-like OSes, `/dev/pts` contains all ptses on the system. The `pts` kernel driver will create a `pts` device when a new user logs in or a new pts is opened.