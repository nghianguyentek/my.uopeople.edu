# File Systems

## Definition

A file system is a rule set to name, store, and retrieve files in a storage device.

## Common File Systems

- File Allocation Table (FAT)
- FAT32
- New Technology File System (NTFS)
- Hierarchical File System Plus (HFS+)
- Apple File System (APFS)
- Extended FAT (exFAT)
- The Extended File System (ext) (1991), ext2 (1993), ext3 and ext4 (2000)  

## Architecture of a file system

- Three layers
  - Physical
  - Virtual
  - Logical

## Mounting and unmouting

Mounting is a process to mount a storage device to a file system

## File Managers

- Finder on macOS
- File Explorer on Windows
- Nautilus on Ubuntu

## File Access Management

- File permissions and ownerships are stored in Access Control List (ACL on Windows) or Access Control Entries (ACE on Unix-like)

## Journaling

Journaling is a feature of modern file system to prevent data corruption due to system failures.

*Note that: new data is still lost*

## Sectors and blocks

- A sector is the minimum storage unit between 512Bs and 4MBs
- A block is an abstraction consisting multiple physical sectors
- A block group is a contiguously grouped blocks for management purpose

### Block group

A block group can contains:
- Super block: a metadata repository
  - Total blocks in block groups
  - inodes
- Group descriptors
- Inode bitmap: bitmap of used (1) and unused (0) inodes in group
- Block bitmap: bitmap of used (1) and unused (0) blocks in group
- Inode table
- Data blocks

## Directories

A directory is a special file used as a logical container containing other files and directories.

## Partitioning schemes

- Master Boot Record (MBR)
- GUID Partition Table (GPT)

### MBR partitioning scheme

- The first sector (512Bs) is the MBR containing boot loader (434~446Bs) and partition table (64Bs).
- MBR gap is 1MBs right after the MBR and before the 1st partition.

#### Disadvantages

- With 64Bs partition table, it limits to keep only four primary partitions. Thus, extented partition is a workaround solution of this issue.
- Each partition size is limited in 2TBs
- MBR has no backup

### GPT partitioning scheme

- The first section is kept for MBR compatable, called MBR protected
- GPT structure includes GPT Header and GPT partition entries, who are backed up in the end of storage device, the Secondary GPT.
- Booting services are stored in EFI System Partition (ESP)

## Firmware schemes

- Basic Input/Output (BIOS)
- Unified Extensible Firmware Interface (UEFI)