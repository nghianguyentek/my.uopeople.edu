# `malloc(3)`

Memory allocation

# Syntax

```c
#include <stdlib.h>

void* malloc(size_t size);
```

where:
- If successful, return a pointer to allocated memory; otherwise, return a `NULL` pointer and set `errno` to `ENOMEM`.

## Examples

### Allocate an integer array

```c
int* p = (int*) malloc(10 * sizeof(int));
```

### Allocate a l-length string

```c
int l = 10;
char* p = (char*) malloc((l + 1) * sizeof(char));
```