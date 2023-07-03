# `msgget()`

Get message queue

## Syntax

```c
#include <sys/msg.h>

int msgget(key_t key, int msgflag);
```

where:
- `key`:
  - `IPC_PRIVATE`
  - an `unsigned int` value (must include `IPC_CREATE` to `msgflag`)
- `msgflag`:
  - `0`: default - get-only
  - `IPC_CREATE`: create if not exist
  - `IPC_EXCL`: fail if exists
  - `0666`: can read and write by all
  - `0600`: can read and write by the owner only
  - `IPC_PRIVATE`: private for the calling process

- Returned value:
  - `-1`: failed, check `errno`
  - a positive integer