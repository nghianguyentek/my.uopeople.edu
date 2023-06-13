# Binary Search

*On a series of numbers*

```java
/**
 * Search the first-found index of the element in a given acsending-ordered array for its value equals a specific value, n
 * 
 * @return the first-found index or -1  
 */ 
static int binarySearch(int[] array, int n) {
  int leftIndex = -1;
  int rightIndex = array.length;

  while (leftIndex+1 != rightIndex) {
    int middleIndex = (leftIndex + rightIndex)/2;
    
    if (n == array[middleIndex]) return middleIndex;  // Found
    
    if (n < array[middleIndex]) rightIndex = middleIndex;
    else leftIndex = middleIndex;
  }

  return -1;  // Not found
}
```