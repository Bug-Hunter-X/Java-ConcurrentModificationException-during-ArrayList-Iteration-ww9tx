# Java ConcurrentModificationException Example

This repository demonstrates a common Java error: the `ConcurrentModificationException`.  The `ConcurrentModificationExceptionExample.java` file shows code that triggers this exception.  The solution, found in `ConcurrentModificationExceptionSolution.java`, illustrates how to avoid this issue using an `Iterator`.

## Problem
Attempting to modify a collection (like an ArrayList) while iterating over it using a for-each loop or enhanced for loop in Java leads to a `ConcurrentModificationException`. The `for-each` loop implicitly uses an iterator, and modifying the collection during iteration interferes with the iterator's internal state causing this exception.

## Solution
The solution is to iterate using an `Iterator` and use its `remove()` method to safely delete elements from the collection.
