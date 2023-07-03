# `_Atomic` Type Specifier

*Since C11*

`_Atomic` type specifier is used as a type qualifier to define an atomic type.

## Examples

### Atomic integer

```c
#include <stdio.h>

int main() {
  _Atomic int i = 0;
  printf("Initialized counter value: %d\n", i);
  int j = ++i;
  printf("Current value: %d\n", j);
  return 0;
}
```