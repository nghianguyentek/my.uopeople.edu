# `msgsnd()`

Send a message to a message queue

## Syntax

```c
#include <sys/msg.h>

int msgsnd(int msqid, const void* msgp, size_t msgsz, int msgflg);
```

where:
- `msqid`: the returned value of a [msgget()](msget.md)
- `msgp`: the pointer to sent message
- `msgsz`: the size in bytes of the sent message, from 0 to `MSGMAX`.
- `msgflg`:
  - `0`: default - if the message queue is full, the call will wait
  - `IPC_NOWAY`: if the message queue is full, the call will fail immediately with `EAGAIN errno`
  - `MSG_RDONLY`: other processes can read only

## `message` structure

```c
struct message {
  long mtype;
  char mtext[sz];
}
```

where:
- `sz`: a positive integer - size in bytes

