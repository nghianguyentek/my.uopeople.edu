# `msgrcv()`

Receive a message from a message queue

## Syntax

```c
#include <sys/msg.h>

size_t msgrcv(int msqid, void* msgp, size_t msgsz, long mtype, int msgflg);
```

where:
- `msqid`: the returned value of a [msgget()](msget.md)
- `msgp`: the pointer to the received message
- `msgsz`: the size of the `msgp->mtext`
- `mtype`: `msgp->mtype`
- `msgflg`:
  - `0`: default - waiting until receiving a matched `mtype` message
  - `IPC_NOWAIT`: if having no message and this flag is on, the call will fail with `ENOMSG errno`
  - `MSG_NOERROR`: if the size of the `mtext` is greater than `msgsz` and this flag is on, the `mtext` will be truncated; otherwise, the call will fail with `E2BIG errno`
  - `MSG_EXCEPT`: used to read a message whose `mtype` differs from the `mtype` argument

## `message` structure

```c
struct message {
  long mtype;
  char mtext[sz];
}
```

where:
- `sz`: a positive integer - size in bytes