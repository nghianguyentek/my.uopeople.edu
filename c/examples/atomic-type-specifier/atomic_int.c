#include <stdio.h>

int main() {
  _Atomic int i = 0;
  printf("Initialized counter value: %d\n", i);
  int j = ++i;
  printf("Current value: %d\n", j);
  return 0;
}