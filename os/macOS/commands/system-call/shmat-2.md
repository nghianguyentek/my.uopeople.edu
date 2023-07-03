# `shmat` (2)

Map a shared memory segment into the calling process address space

## Syntax

```c
#include <sys/shm.h>

void* shmat(int shmid, const void* shmaddr, int shmflag) 
```

where:
- `shmid`: the returned value of [shmget(2)](shmget-2.md)
- `shmaddr`: the address used to attach the shared memory system
  - `NULL`: default address determined by the OS. If the default address is not available, `shmat` will fail
- `shmflag`:
  - `SHM_RWM` or `0`: default - read and write mode
  - `SHM_RDONLY`: read-only mode
  - `SHM_RND`
  - `SHM_REMAP`
  - `SHM_NORESERVE`


## Examples

### Attach using default address

```c
#include <sys/shm.h>

int main() {

  void* shmp = shmat(shmid, NULL, 0);
  if (shmp == (void*) -1) {
    exit(1);
  }

  // Do something with the shared memory segment

  shadt(shmp);

  return 0;
}
```