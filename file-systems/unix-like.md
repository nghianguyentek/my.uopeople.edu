# Unix-like 

## Characteristics

- Single file system tree

## File metadata

A file metadata is information about the file, such as:
- Size
- Timestamps
- Owner
- Mode
- Allocated block

## inode

- An inode is a data structure of file metadata in Unix-like OSes (similarly Master File Table-MFT in NTFS).
- Every file has at least one inode
- Each inode has a unique number, inode number.
- They are stored in inode table.

```sh
df -i
```

```sh
ls -li
```