# Proof by Mathematical Induction

## Steps

1. Base case: The problem is correct with one or some first elements in the variable domain
1. Induction step: 
   1. Hypothesis: Suppose the problem is correct with the previous of the last element in the variable domain
   1. Use the hypothesis (and the base case when necessary) to prove that the problem is correct with the last element in the variable domain.

## Examples

### 1. The sum of the first n positive integers

#### Problem

Prove S(n) = &Sigma;<sup>n</sup><sub>i=1</sub>i = n(n+1)/2

#### Solution

1. For n = 1, S(1) = 1(1+1)/2 = 1, is correct.
1. Suppose the problem is correct with n-1, S(n-1) = (n-1)(n-1+1)/2 = n(n-1)/2 (*)
1. S(n) = S(n-1) + n (**)
1. Subtitute (*) into (**), we have S(n) = n(n-1)/2 + n = n(n-1+2)/2 = n(n+1)/2

### 2. The sum of the first n positive odd numbers

#### Problem

Prove S(n) = &Sigma;<sup>n</sup><sub>i=1</sub>2i-1 = n<sup>2</sup>

#### Solution

1. For n = 1, S(1) = 1, is correct
1. Suppose the problem is correct with n-1, S(n-1) = (n-1)<sup>2</sup>
1. We know S(n) = S(n-1) + 2n-1
1. Substitute (2) in (3) we have S(n) = (n-1)<sup>2</sup> + 2n-1 = n<sup>2</sup> 

### 3. Proposed closed-form for a recurrence relation

#### Problem

If T(n) = T(n-1)+1 and T(1) = 0, prove T(n) = n-1

#### Solution

1. For n = 1, T(1) = 1-1 = 0, which is correct.
2. Suppose T(n-1) = (n-1)-1 = n-2 is correct
3. We know T(n) = T(n-1) + 1
4. Substitute (2) in (3), we have T(n) = n-2 + 1 = n-1

### 4. Use some to form any value

#### Problem

Prove that we can use 2 and 5 to form any value greater than 4
1=>4=2*2n
2=>5
3=>6=2*n
4=>7
5=>8=2*(n-1)
#### Solution

1. For n = 1, we can use f(1) = 4 = 2*2 to form it
1. Suppose for n - 1, we can use 2 and 5 to form the value in either forms:
   - f(n-1) = 2x, with x > 2 
   - f(n-1) = 2x+5, with x >= 0
1. And we know f(n) = f(n-1) + 1
1. Substitute (2) in (3), we have
   -  => with x > 2, f(n) = 2x + 1 = 2x + 5-2*2 = 2(x-2) + 5 with x > 2
   - (**) => with x ?>= 0, f(n) = 2x+5 + 1 = 2x + 6 = 2x + 2*3 = 2(x+3)

### 5. Disvisible by a prime number

#### Problem

For n > 1, n is divisible by a prime number.

#### Solution

1. Choose n = 2, n is divisible by 2, a prime number.
2. Suppose 2 <= a <= n-1, a is divisible by a prime number.
3. We have
   - If n is a prime number, n is divisble by itself.
   - If n is not a prime number, n = ab. Since a is divisible by a prime number, n is divisible by that number.

### Two-colored regions of a plane

We separate a plane with n lines and then assign each region by a color in the two such that no two regions sharing a side have the same color. Assume the two color are black and white.

#### Problem

Prove that regions formed by n lines in the plane can be two-colored

#### Solution

1. For n = 1, we can fill one side with white and the other with black.
2. Suppose with n = n - 1, we can fill all regions two-colored
3. Let the nth line split the plane into two parts, each part is two-colored. Reverse color of one place, we have a two-colored plane.

### Correctness of a function

#### Problem

Prove that the following `fact()` function is correct for any `n`:

```java
static long fact(int n) {
   assert n >= 0 && n <= 20 : "n out of range";
   if (n <= 1) return 1;
   return n * fact(n - 1); 
}
```

#### Solution

1. For `n < 0` or `n > 20`, function throws an `AsssertionError`, which is correct.
1. For `n = 0` or `n = 1`, function returns `1`, which is correct.
1. For any other n, assumpt `fact(n-1)` correctly returns `(n-1)!`.
1. We expect `f(n) = n! = n * n-1!`
1. Substitute 3 into 4, we have `f(n) = n * fact(n-1)`.