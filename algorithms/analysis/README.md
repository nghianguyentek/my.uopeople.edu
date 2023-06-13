# Algorithm Analysis

## Common subjects

- [Time cost of running an algorithm](#time-cost-of-running-an-algorithm)
- [Space cost of a data structure]()

## Time cost of running an algorithm

### Common factors

- Input size, `n`. We present the time cost of an algorthm based on its `n`, as a function of `n`, `T(n)`.
- Basic operations: time-to-complete of a basic operation doesn't depend on the values of its operands, but on the input size (directly or indirectly).
- Constant runtime operations: their time-to-complete doesn't depend on the input size
- Uncertain runtime operations

#### Examples

1. Analysis the following function 

```java
static int getMaxValue(int[] array) {
  int maxValue = array[0], arrayLength = array.length;
  for (int i = 1; i < arrayLength; i++)
    if (maxValue < array[i]) 
      maxValue = array[i];

  return maxValue;
}
```

- Constant costs:
  - `maxValue = array[0]`
  - `arrayLength = array.length`
  - `int i = 1`
  - `return maxValue`
- Basic operations:
  - `i < arrayLength`
  - `maxValue < array[i]`
  - `i++`
- Uncertain operations:
  - `maxValue = array[i]`

## Loop analysis

|Loop form|Times
|:-:|:-:
|`i=1; i<=n; i++`|n
|`i=1; i<=n; i*=2`|(log<sub>2</sub>n)+1
|`i=1; i<=n; i++;` and `j=1; j<=i; j++`| (&Sigma;<sup>n</sup><sub>x=1</sub> x) = n(n+1)/2
|`i=1; i<=n; i++` and `j=1; j<=n; j++`| (&Sigma;<sup>n</sup><sub>x=1</sub> n) = n<sup>2</sup>
|`i=1; i<=n; i*=2` and `j=1; j<=n; j++`| (&Sigma;<sup>log<sub>2</sub>n</sup><sub>x=0</sub> n) = nlog<sub>2</sub>n + 1
|`i=1; i<=n; i*=2` and `j=1; j<=i; j++`| (&Sigma;<sup>log<sub>2</sub>n</sup><sub>x=0</sub> 2<sup>x</sup>) = 2<sup>log<sub>2</sub>n+1</sup></sup> - 1 = 2n - 1


### From 1 then multiple by 2 each time until reach n

- i=1 and each time i*=2, then i = 2<sup>k</sup>
- i<sub>min</sub> = 1 => k<sub>min</sub> = 0
and i<sub>max</sub> = n => k<sub>max</sub> = log<sub>2</sub>n
- Thus, the total times is (&Sigma;<sup>log<sub>2</sub>n</sup><sub>i=0</sub> 1) = log<sub>2</sub>n + 1

## Growth rates

The growth rate of an algorithm is the rate of the input size `n` over the time cose `T`.

### Common growth rate types

- Constant
- Linear
- Quadratic
- Exponential

*The bigger growth rate, the less effective we get if only upgrading the computing speed.*

## Bounds

### Upper bound

The highest growth rate that the algorithm can have

Big-oh notation, &Omicron; - has an upper bound to its growth rate of*

### Lower bound

The lowest growth rate that the algorithm can have

Big-omega notation, &Omega; - least amount of a resource that an algorithm needs for some class of input

### &theta; notation

Big-theta notation, &Theta; - upper and lower bounds are the same

## Rules

- If *f(n)* is in *&Omicron;(g(n))* and *g(n)* is in *&Omicron;(h(n))*, then *f(n)* is in *&Omicron;(h(n))*
- If *f(n)* is in *&Omicron;(kg(n)) for any *k > 0*, then *f(n)* is in *&Omicron;g(n)*
- If *f<sub>1</sub>(n)* is in *&Omicron;(g<sub>1</sub>(n))* and *f<sub>2</sub>(n)* is in *&Omicron;(g<sub>2</sub>(n))*, then *f<sub>1</sub>(n)* + *f<sub>2</sub>(n)* is in *&Omicron;(max(g<sub>1</sub>(n), g<sub>2</sub>(n)))*
- If *f<sub>1</sub>(n)* is in *&Omicron;(g<sub>1</sub>(n))* and *f<sub>2</sub>(n)* is in *&Omicron;(g<sub>2</sub>(n))*, then *f<sub>1</sub>(n)f<sub>2</sub>(n)* is in *&Omicron;(g<sub>1</sub>(n)g<sub>2</sub>(n))*

## Best, worst, average cases

We often interest in average-case if possible; otherwise, worst-case.



