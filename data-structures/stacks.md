# Stack Data Structures

A stack is a list-like structure that adds elements at one end and removes elements at the other.

## Characteristics

- Push elements in the stack
- Pop elements out the stack

## Common implementations

- Array-based stacks
  - Fixed-size
  - Dynamic
- Linked stacks

## Compare array-based and linked stacks

|Array-based stacks|Linked stacks
|-|-
|Adding element requires checking size|Adding element doesn't require checking size
|Redundunt storage if the number of elements is less than a half of the actual size|Doesn't have non-used elements
|Doesn't require storage for links|Require storage for links
|Efficient random access - &Theta;(1) in all cases|Inefficient random access, especially in the worst and average case: &Theta;(1) in the best case, &Theta;(n) in the worst case, and &Theta;(n(n+1)/2n) ~ &Theta;(n) in the average case
|Inefficient in adding and removing element - &Theta;(1) in the best case, &Theta;(n-1) = &Theta;(n) in the worst case, and &Theta;((n-1)(n-1+1)/2n) = &Theta;((n-1)/2) ~ &Theta;(n) in the average case|Efficient in adding and removing element - &Theta;(1) in all cases (for two-way linked list)


*In general, if we mostly do searchs, we should use array-based lists; if we frequently add and remove elements, use linked lists.*