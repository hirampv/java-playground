# java-playground
Dusting off the old Java skills


# FizzBuzz Program Documentation

## Overview
This document provides an explanation of the `FizzBuzz.java` program, which implements the classic FizzBuzz problem. The program iterates through numbers from 1 to 100 and applies specific rules for outputting values based on divisibility conditions.

## How It Works
The program follows these rules:
- If a number is divisible by **both 3 and 5**, print **"FizzBuzz"**.
- If a number is divisible by **only 3**, print **"Fizz"**.
- If a number is divisible by **only 5**, print **"Buzz"**.
- Otherwise, print the number itself.

## Code Explanation
The core logic is implemented inside the `main` method of the `FizzBuzz` class:

### Class: `FizzBuzz`
This class contains a `main` method that executes the program logic.

### `main` Method:
1. **Loop through numbers 1 to 100**
   - A `for` loop iterates from 1 to 100 (inclusive).
2. **Check divisibility conditions**
   - If the number is divisible by both `3` and `5`, print **"FizzBuzz"**.
   - If only divisible by `3`, print **"Fizz"**.
   - If only divisible by `5`, print **"Buzz"**.
   - Otherwise, print the number itself.
3. **Using `continue` statement**
   - The program uses `continue` statements to skip subsequent checks when a condition is met.

## Code Listing
```java
/**
 *  Take on the classic FizzBuzz problem.
 *  This program outputs numbers from 1 to 100, but:
 *   - For multiples of 3, prints Fizz instead of the number.
 *   - For the multiples of 5, prints Buzz.
 *   - For numbers which are multiples of both 3 and 5, prints FizzBuzz.
 **/

public class FizzBuzz {
    public static void main(String[] args) {
      
      for (int i = 1; i < 101; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
          System.out.println("FizzBuzz");
          continue;
        }
        if (i % 3 == 0) {
          System.out.println("Fizz");
          continue;
        }
        if (i % 5 == 0) {
          System.out.println("Buzz");
          continue;
        }
        System.out.println(i);
      }
      
    }
}
```

## Execution Instructions
To compile and run the program, follow these steps:

### Compilation:
```sh
javac FizzBuzz.java
```

### Execution:
```sh
java FizzBuzz
```

## Example Output
```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
...
98
Fizz
Buzz
```

## Potential Improvements
- Allow user input to define a custom range.
- Add unit tests to verify the output.
- Optimize the logic by replacing `continue` with an `else if` structure for better readability.

## Conclusion
The `FizzBuzz.java` program is a simple implementation of the classic FizzBuzz problem. It demonstrates control structures and conditional logic effectively. The program can be extended or modified to suit different needs.

