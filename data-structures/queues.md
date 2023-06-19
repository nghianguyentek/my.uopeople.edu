# Queue Data Structures

A queue is a list-like structure that adds new element to one end and removes from the other.

## Characteristics

- Enqueue
- Dequeue
- FIFO (First-In First-Out)

*[Java Queue ADT example](MyIQueue.java)*

## Common implementations

- Array-based queue
  - Fixed front position ([Java example](impl/MyArrayFixedFrontQueue.java))
  - Drifting
  - Circular
- Linked queue

## Compare array-based and linked queues

|Array-based queues|Linked queues
|-|-
|Adding element requires checking size|Adding element doesn't require checking size
|Redundunt storage if the number of elements is less than a half of the actual size|Doesn't have non-used elements
|Doesn't require storage for links|Require storage for links
|Efficient pushing and poping - &Theta;(1) in all cases|Efficient pushing and poping - &Theta;(1) in all cases

### Notes

- If a stack always contains a fix amount of elements, array-based implementations may be better in storage aspect.

## Stack and recursion

We can use stack to convert a recursive-form of an algorithm to an iterative-form when unable to do it directly.