# Concurrency & Parallel Computing

## Concurrency

At a time, one processor can handle one instruction only.
Multi-theads on the same processor share execution time and is switched in the same maner as process-switch
A process now contains Thread Control Blocks (TCBs) to save states of its threads for context-switch
Each thread has a different stack and execution point.

## Parallel

Split a task into subtasks and assign them for multiple cordinate processors.

### Advantages

- Save time and money
- Use non-local resource
- Utilise hardware & threads

### Use cases

- Real-time simulation systems