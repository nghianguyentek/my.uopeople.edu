# File

A file is a named collection of data blocks.

## Binary and text files

Technically, since every file is a sequence of bits, it is binary. However, most people use the binary file term to indicate a file whose content is not human-readable. On the other hand, a file whose content is human-readable (of course, after being decoded by the appropriate [character coding scheme](#character-encoding-schemes)) is a text file.

## Character encoding schemes

A character encoding scheme is a standard method to encode human-readable characters into binary format and vice versa. Some common ones are:
- ASCII (American Standard Code for Information Interchange)
- [Unicode](#unicode)
  - [UTF-8](#utf-8)
  - [UTF-16](#utf-16)

### Unicode

Unicode (Universal Character Code)

### UTF-8

UTF-8 (Unicode Transformation Format - 8-bit) is a variable-length character encoding scheme based on Unicode. Since it supports all Unicode characters, it's the most used on the Internet.

### UTF-16

UTF-16 (Unicode Transformation Format - 16-bit) is a fixed-length (2 bytes) character encoding scheme based on [UCS-2](#ucs-2).

### UCS-2

UCS-2 (Universal Character Set 2) is a 16-bit character encoding scheme supporting 1112064 Unicode characters.

## File header

A file, especially a non-text one, often reserves some of its first bytes to contain its metadata, called header. The header of a file contains essential information for OSes and other software to know how to deal with it correctly. In fact, a text file may use three first bytes to store a Byte Order Mark (BOM), indicating its character encoding scheme. 

### Common information

- File type
- File size
- Creation time
- Modification time

### Optional information

- Author
- Copyright
- Compression settings