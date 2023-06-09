# Stack Data Structures

A stack is a list-like structure that adds and removes elements from only one end.

## Characteristics

- Push elements in the stack
- Pop elements out the stack
- LIFO (Last-In First-Out)

*[Java Stack ADT example](MyIStack.java)*

## Common implementations

- Array-based stacks
  - Fixed-size
  - Dynamic ([Java example](impl/MyArrayStack.java))
- Linked stacks ([Java example](impl/MyLinkedStack.java))

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