# Stack Data Structures

A stack is a list-like structure that adds and removes elements from only one end.

## Characteristics

- Push elements in the stack
- Pop elements out the stack

*[Sample of Stack ADT](MyIStack.java)*

## Common implementations

- Array-based stacks
  - Fixed-size
  - Dynamic ([Sample](impl/MyArrayStack.java))
- Linked stacks ([Sample](impl/MyLinkedStack.java))

## Compare array-based and linked stacks

|Array-based stacks|Linked stacks
|-|-
|Adding element requires checking size|Adding element doesn't require checking size
|Redundunt storage if the number of elements is less than a half of the actual size|Doesn't have non-used elements
|Doesn't require storage for links|Require storage for links
|Efficient pushing and poping - &Theta;(1) in all cases|Efficient pushing and poping - &Theta;(1) in all cases

### Notes

- If a stack always contains a fix amount of elements, array-based implementations may be better in storage aspect.

## Stack and recursion

We can use stack to convert a recursive-form of an algorithm to an iterative-form when unable to do it directly.