# Visitor Pattern

*One of GoF patterns*

## Use cases

- Adding new behavior to an existing class

## Characteristics

- Open/Closed principle

## Disadvantages

- Can't access private members

## Example

### Java

#### Build
```sh
javac -verbose -g -deprecation -d design-patterns/visitor/build -encoding UTF-8 design-patterns/visitor/*.java
```

#### Run example

```sh
java -cp design-patterns/visitor/build VisitorExample   
```