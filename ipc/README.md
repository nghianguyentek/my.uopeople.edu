# Inter-process Communication (IPC)

IPC is the situation of two or more processes on the same or different machines interacting with others.

## Common methods

- Shared memory
- Pipes
- Message queue
- Sockets

## Shared memory method

*Processs in the same machine only*

### Flow

1. Get or create shared memory segment
1. Attach the shared memory segment to the current process address space
1. Read or write data
1. Detach the shared memory segment out the current process address space
1. Remove the shared memory segment and release the allocated memory

## Message queue

*Processes in the same or different machines*

### Flow

1. Create or get a message queue
1. Send or retrieve message
1. Delete the message queue