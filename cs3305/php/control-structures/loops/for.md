# `for` loop

## Syntax

```php
for (initialization; condition; incrementOrDecrement) { 
  // Do something 
}
```

- `initialization`: initialize variables, especially counter variables
- `condition`: a boolean expression that is evaluated at the beginning of each interation. If the evaluated value is not true, for loop will end.
- `incrementOrDecrement`: change counter variables at the end of each iteration

## Flow

1. Execute `initialization`
1. Evaluate `condition`, if true, go to 3; otherwise, goto 5
1. Execute for body
1. Execute `incrementOrDecrement`
1. End

## Examples

### Print a number seri

```php
for ($i = 1; $i < 6; $i++) {
  echo $i;
}
```

Output: `12345`