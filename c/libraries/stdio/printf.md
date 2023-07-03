# `printf()`

Formatted output

## Syntax

```c
#include <stdio.h>

int printf(const char* format, ...);
```

## Format specifiers

- `%d`: placeholder of an integer
- `%f`: placeholder of a floating-point number
- `%s`: placeholder of a string
- `%c`: placeholder of a char
- `%%`: the `%`

## Examples

### Prints an integer

```c
#include <stdio.h>

int main() {
  printf("The current value: %d\n", 10);
  return 0;
}
```