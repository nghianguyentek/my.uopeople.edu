# `shmctl(2)`

Shared memory control operations

## Syntax

```c
#include <sys/shm.h>

int shmctl(int shmid, int cmd, struct shmid_ds* buf);
```

where:

- `shmid`: the returned value of a succesful [shmget(2)](shmget-2.md)
- `cmd`:
  - `IPC_STAT`: get information about the shared memory segment
  - `IPC_SET`: update information
  - `IPC_RMID`: remove and destroy belonging data
- `buf`: 
  - pointer to get/set information
  - `NULL`: in removing case

## shmid_ds structure

```c
struct shmid_ds {
  struct ipc_perm shm_perm;  // permissions
  size_t shm_segsz;  // size in bytes
  pid_t shm_lpid;  // pid of last shm operation
  pid_t shm_cpid;  // pid of creator
  short shm_nattch;  // number of current attaches
  time_t shm_atime;  // time of last attach
  time_t shm_dtime;  // time of last detach
  time_t shm_ctime;  // time of last change, i.e., previous call of shmctl()
  void* shm_internal;  // sysv stupidity
};
```

## ipc_perm structure

```c
struct ipc_perm {
  uid_t uid;  // owner
  gid_t gid;  // owner's group
  uid_t cuid;  // creator
  gid_t cgid;  // creator's group
  mode_t mode;  // r/w permission
  unsigned short _seq;  // internal use
  key_t _key;  // internal use
};
```