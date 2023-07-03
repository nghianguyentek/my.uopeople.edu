# `shmget` (2)

Get shared memory area identifier

## Syntax

```c
#include <sys/shm.h>

int shmget(key_t key, size_t size, int shmflg);
```

where:
- `key`: used to identify the segment
  - `IPC_PRIVATE`
  - An `unsigned int` value (must include `IPC_CREATE` to `msgflag`)
- `size`: an `unsigned int` value
- `shmflg`: used to control the access permissions and the type of the segment and the behavior of the call
  - `IPC_CREATE`: create if not exist
  - `IPC_EXCL`: fail if exists
  - `0666`: can read and write by all
  - `0600`: can read and write by the owner
  - `IPC_PRIVATE`: private for the calling process

## Examples

### Create a shared memory segment that anyone can read and write to

```c
#include <stdio.h>
#include <stdlib.h>
#include <sys/shm.h>

int main() {
  int key = 1234;
  int shmid = shmget(key, 1024, IPC_CREATE | 0666);
  if (shmid == -1) {
    perror("shmget");
    exit(1);
  }

  printf("Sucessful create a shared memory segment named %d", key);

  return 0;
}
```