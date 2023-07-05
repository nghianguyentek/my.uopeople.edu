# File Systems

In an OS context, a file system is a rule set showing how to name, store, and retrieve files on a partition, a logical division of a physical storage device. Based on file systems, OS can organize files and directories efficiently, consistently, and securely. Without file systems, there are no files and directories, only contiguous data blocks on a storage device. Thus, to get the expected data blocks, one must know the start and end addresses (sector numbers). We often call storage devices, in this situation, raw disks. In fact, if we don't need file management, we don't need file systems; for example, with embedded OSes, deleted data recovery, and disk backup.

## A typical scenario

Back to the world of OS with file systems, after plugging a physical storage device into a computer, we often do the following steps:
1. Partitioning
   1.	Define the [scheme](#partitioning-schemes) and initialize the partition table.
   1.	Create a partition and update the partition table.
1.	Format the newly created partition with a particular file system.
1.	Mount the formatted partition into the file system tree.

Although we can use commands in a shell to accomplish these steps, working with a GUI tool whenever possible is a better approach since it reduces the underline complexity and error-prone typing. Unfortunately, most server-version Linux distros don't provide GUI. Therefore, if you tend to become a system administrator or a DevOp, looking at `fdisk(8)` and `mkfs(8)` may help you.

Of course, this is only for the first time (or you want to practice it). In many cases, the manufacturers already did all these for us. Now we can create, write, copy, modify, execute, and delete our files and directories on mounted partitions.

### Partition creation

When creating a partition, the required information includes its number, first sector, and size.

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

There are two popular partitioning schemes, [Master Boot Record (MBR)](#mbr-partitioning-scheme) and [GUID Partition Table (GPT)](#gpt-partitioning-scheme). The latter is more common today due to the limits of the first, such as the maximum size of a partition and no backup for the MBR sector.

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