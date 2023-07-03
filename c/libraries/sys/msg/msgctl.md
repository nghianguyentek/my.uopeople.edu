# `msgctl()`

Message control operations

## Syntax

```c
#include <sys/msg.h>

int msgctl(int msqid, int cmd, struct msqid_ds* buf);
```

where:
- `msqid`: the returned value of a [msgget()](msget.md)
- `cmd`:
  - `IPC_STAT`: gather information
  - `IPC_SET`: update information
  - `IPC_SET`: remove the queue and release used resources
- `buf`: a pointer of a message queue data structure
- The returned value:
  - `0`: success
  - `-1`: fail with `errno`

## `msqid_ds` data structure

```c
struct msqid_ds {
  struct ipc_perm msg_perm;  // permissions
  msglen_t msg_cbytes;  // size in bytes
  msgqnum_t msg_qnum;  // number of messages
  msglen_t msg_qbytes;  // max size
  pid_t msg_lspid;  // pid who last sent
  pid_t msg_lrpid;  // pid who last received
  time_t msg_stime;  // time of last sent
  time_t msg_rtime;  // time of last received
  time_t msg_ctime;  // time of last modified
};
```

## `ipc_perm` structure

```c
struct ipc_perm {
  uid_t cuid;  // creator
  gid_t cgid;  // creator's group
  uid_t uid;  // owner
  gid_t gid;  // owner's group
  mode_t mode;  // r/w permissions
  unsigned short seq;  // sequence number - internal use
  key_t key;  // user-defined key
};
```