# File

A file is a named collection of data blocks. A file, especially a non-text one, often reserves some of its first bytes to contain its metadata, called header. In fact, a text file may use three first bytes to store a Byte Order Mark (BOM), indicating its character encoding scheme.

## File header

A file header contains essential information for OSes and other software to know how to deal with it correctly.

### Common information

- File type
- File size
- Creation time
- Modification time

### Optional information

- Author
- Copyright
- Compression settings