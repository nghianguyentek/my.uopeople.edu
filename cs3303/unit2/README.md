# Unit 2 - Algorithm Analysis

## Reading Assignment

- A Practical Introduction to Data Structures and Algorithm Analysis
  - Chapter 3: Algorithm Analysis
- Supplemental video lectures
  - http://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-046j-introduction-to-algorithms-sma-5503-fall-2005/video-lectures/lecture-1-administrivia-introduction-analysis-of-algorithms-insertion-sort-mergesort/
  - https://ocw.mit.edu/courses/6-046j-introduction-to-algorithms-sma-5503-fall-2005/resources/lecture-2-asymptotic-notation-recurrences-substitution-master-method/

## Discussion Assignment

If you have discovered a different way of understanding the problem or solving the problem share your approach with your peers.  The objective of this assignment is to collaboratively learn and develop correct results for each of the problems.    Asymptotic analysis is a difficult concept to master as such we will all benefit by understanding each others perspectives.

1. Suppose that algorithm A takes 1000n<sup>3</sup> steps and algorithm B takes 2<sup>n</sup> steps for a problem of size n. For what size of problem is algorithm A faster than B (meaning algorithm A has fewer steps than B)?  In your answer describe not only what the answer is but how you arrived at the answer.  

2. Give the upper bound (big O notation) that you can for the following code fragment, as a function of the initial value of n.

for(int i = 0; i < n; i++) {
    for(int j = 0; j < i; j++){
        //do swap stuff, constant time
    }
}

Do you think that the lower bound is likely to be the same as the answer you gave for
the upper bound? In your response state why or why not.

## Learning Journal

You are required to write at least 500 words.

## Self-Quiz