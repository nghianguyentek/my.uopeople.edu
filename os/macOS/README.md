# Macintosh Operating System - macOS

*Old names: Mac OS X and OS X*

Mach kernel and BSD -> NeXTSTEP -> Mac OS X

## File systems

- APFS (Apple File System)
- Read-only NTFS (New Technology File System)

## Kernel components

- Drawin (core)
  - Mach component (the kernel of Mach 3.0 OS): VMM (Virtual Memory Management), IPC (Interprocess Communication), preemptive multitasking, protected memory, and console I/O
  - BSD component (FreeBSD 5.0 OS): POSIX-compliant API (system calls on-top Mach functionalities), UNIX process model (pid/gids/pthreads on-top Mach task/thread), VFS (Virtual File System), and network stack
  - IOKit component: a framework to build drivers providing exception handling, multiple inheritance, Plug&Play, power management, registry system, and templating

### BSD component

- Syscall calling convention

### IOKIt component

- I/O Registry

### Miscellancious

- kdumpd
- inetd UDP 1069
- launchd
- sshd

## Frameworks

- Cocoa
- Carbon

## History

- 1976: NeXT and NeXTSTEP introduced by Steve Jobs, Steve Wozniak, and Ronald Wayne
- 1984: introduced
- 1997
  - February:  acquired NeXT
  - July: Mac OS X v8
- 1999
  - March: Mac OS X Server 1.0 released
- 2001
  - March: Mac OS X v10.0 - Cheetah released
  - September: Mac OS X v10.1 - Puma released
- 2002
  - August: Mac OS X v10.2 - Jaguar released
- 2003
  - October: Mac OS X v10.3 - Panther released
- 2005
  - April: Mac OS X v10.4 - Tiger released
- 2007
  - October: Mac OS X v10.5 - Leopard released
- 2009
  - August: Mac OS X v10.6 - Snow Leopard released
- 2011
  - July: Mac OS X v10.7 - Lion released
- 2012
  - July: OS X v10.8 - Moutain Lion released
- 2013
  - October: OS X v10.9 - Mavericks released
- 2014
  - October: OS X v10.10 - Yosemite released
- 2015
  - September: OS X v10.11 - El Capitan released
- 2016
  - September: macOS v10.12 - Sierra released
- 2017
  - September: macOS v10.13 - High Sierra released
- 2018
  - September: macOS v10.14 - Mojave released
- 2019
  - October: macOS v10.15 - Catalina released
- 2020
  - November: macOS v11 - Big Sur released
- 2021 
  - October: macOS v12 - Monterey released
- 2022
  - June: macOS v13 - Ventura released