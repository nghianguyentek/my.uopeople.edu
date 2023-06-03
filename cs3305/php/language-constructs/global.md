# `global` language construct

Used to declare global variables in a function. If those variables are declared before, PHP will use them.

## Samples

### Using a declared global-variable

```php
$a = 'a';  // declare global-variable and assign 'a' to it

function test() {
  global $a;  // $a is global instead of local

  echo $a;
}

test();  // a
```

### Declare a gloal variable in a function

```php
function test() {
  global $a;  // declare a new global variable

  echo $a;
}

$a = 10;  // assign 10 to $a

test();  // 10
```