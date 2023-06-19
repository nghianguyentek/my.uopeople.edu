# Data Structures

## Terms

- Type: a collection of values
  - Simple type: type with no subparts
  - Aggregate or composite type: a combination of two or more types, including itself
- Data item: an item belongs to a particular type
- Data type: a type and its operations
- Abstract data type (ADT): a software component represents a particular data type
- Data structure: an implementation of a particular ADT
  - In Java:
    - Class: a blueprint of a data structure used to create objects belongs to it
    - Object: an instance of a class
    - Method or member function: an operation of a ADT
    - Data member: an internal data item of a data structures

## Fundamental data structures

- [Lists](lists.md)
- [Stacks](stacks.md)
- [Queues](queues.md)

```shell
javac -source 17 -verbose -Xlint:unchecked -sourcepath . -g -encoding UTF-8 -d ./build **/*.java
java -cp build MyArrayListTest
```