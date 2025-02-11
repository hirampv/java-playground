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