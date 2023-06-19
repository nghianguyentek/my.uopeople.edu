# List Data Structures

A list is a sequence of data items.

## Characteristics

- A sequence of elements
- Each element has a position or index, that often starts at 0
- The number of elements is the length or size of the list
- If having no element, the list is empty
- The beginning of a list is called the head, and the end of it is called the tail
- We can add and remove an element at a particular position. If doesn't specify the adding position, we will add it to the end of the list (i.e., right after the currently last element)
- We can get value of a particular element at an specific position

*[Java List ADT example](MyIList.java)*

## Common implementations

- Array-based lists
  - Fixed-size
  - Dynamic ([Java example](impl/MyArrayList.java))
- Linked lists
  - Forward-only
  - Two-way (aka, double)

## Compare array-based and linked lists

|Array-based lists|Linked lists
|-|-
|Adding element requires checking size|Adding element doesn't require checking size
|Redundunt storage if the number of elements is less than a half of the actual size|Doesn't have non-used elements
|Doesn't require storage for links|Require storage for links
|Efficient random access - &Theta;(1) in all cases|Inefficient random access, especially in the worst and average case: &Theta;(1) in the best case, &Theta;(n) in the worst case, and &Theta;(n(n+1)/2n) ~ &Theta;(n) in the average case
|Inefficient in adding and removing element - &Theta;(1) in the best case, &Theta;(n-1) = &Theta;(n) in the worst case, and &Theta;((n-1)(n-1+1)/2n) = &Theta;((n-1)/2) ~ &Theta;(n) in the average case|Efficient in adding and removing element - &Theta;(1) in all cases (for two-way linked list)


### Notes

- In general, if we mostly do searchs, we should use array-based lists; if we frequently add and remove elements, use linked lists