# `shmdt` (2)

Unmap shared memory

## Syntax

```c
#include <sys/shm.h>

int shmdt(const void* shmaddr);
```

where:

- `shmaddr`: the returned value of a calling of [shmat(2)](shmat-2.md)