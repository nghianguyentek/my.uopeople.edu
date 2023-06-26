# Unix Operating System

*AT&T Unix deriviation*

## History

- Mid-late 1960s, MIT, AT&T Bell Labs, and GE developed MULTICS (Multiplexed Information and Computing Service)
- Ken Thompson added disk scheduler, exec call interface, an assembler, an editor, and a shell into a DEC PDP-7 minicomputer. This is the first form of Unix.
- The development of Unix doesn't have a plan and based on requested features, which one a Unix command.
- The Unix command names are short due to typing difficulty of the terminals (Model 33 Teletype), such as `ls` (list), `cp` (copy), `rm` (remove), and `mv` (move).
- Douglas Mcllroy, also a AT&T Bell Labs researcher, added the `pipe` feature.
- Thompson wrote `grep` (global regular expression print) command based on the `ed` (editor) as Mcllory suggested Unix should have an utility to search texts in files.
- Mid-1980s, other vendors released their own version of Unix, such as HP-UX, IBM's AIX, Microsoft's Xenix and Sun's SunOS
- 1983, Richard Stallman started GNU (GNU's Not Unix) project, a free software platform.
- 1985, Steve Jobs found NeXT and build NeXT and NeXTSTEP, a graphical desktop having on-screen graphics Display PostScript, available and running application dock, and toolkits prodiving Object-Oriented application layer.
- 1991, a Finnish student, Linus Torvalds started a project that becomes Linux, the kernel later. After that, he released Linux under GNU GPL (General Public License).
- 1992, community released X Window System, the first graphical UI for Linux. Although Linux is actually the kernel only, we often think it as a complete OS.
- 1996, Steve Jobs returned to Apple and purchased NeXT to build Macintosh OS for Macs.
- Today, most Unix on servers are Linux, and on desktops are macOS.

## Characteristics

- Modular kernel
- Closed-source
- Multitasking
- Multi-users
- Enterprise-level
- No GUI
- Powerful command-line tools
- CLIs
  - bourne
  - korn
  - c
  - zsh
- Shell scripting to automate tasks
- Security
- File systems:
  - zfs
  - js
  - hfx
  - gps
  - xfs
  - vxfs

## Advantages

- Stability
- Security
- Scalability
- Flexibility
- Powerful CLI

## Disadvantages

- Complexity
- Very expensive
- Unportable
- No standard
- Limited applications
- Steep learning curve

## Use cases

- Enterprise-computing
- Scientific research
- Web servers

## Variants

- AIS
- HP-UX
- BSD: starting script `etc/rc`
  - NeXT
    - NeXTSTEP (graphical desktop)
  - 4.4BSD-Lite/2
  - FreeBSD
    - Drawin
      - macOS
  - OpenBSD
  - NetBSD
  - SunOS (later Solaris)
- System V release 4: starting script `/etc/inittab`
  - Solaris
- Iris
- Linux

## System structure

- Hardware
- Kernel
- Shell commands
- Application

### Kernel

- Hardware control
- Device drivers
  - Character
  - Block
- Buffer cache
- File subsystem
- Process control subsystem
  - Inter-process communitcation
  - Scheduler
  - Memory management
- System call interface

### File subsystem

- Manage files
- Allocate file space
- Manage free space
- Control file access