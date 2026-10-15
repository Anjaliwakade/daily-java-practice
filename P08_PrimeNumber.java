
//Write a Java program to check whether a given integer is a prime number.

import java.util.Scanner;

public class P08_PrimeNumber {
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sobj.nextInt();

        if (num <= 0) {
            System.out.println("Not a prime number");
            sobj.close();
            return;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println("Not a prime number");
                sobj.close();
                return;

            }

        }

        System.out.println("Prime number");
        sobj.close();

    }

}

///////////////////////////////////////

/*
 * 
 * A prime number has exactly two positive factors: 1 and itself.
 * 
 * 
 * Condition: i * i <= num
 * 
 * Why do we use this condition?
 * 
 * We check divisors starting from i = 2.
 * 
 * We only need to check divisors up to the square root of the number.
 * 
 * If any number divides num completely (num % i == 0), it is not a prime
 * number.
 * 
 * If no divisor is found, the number is prime.
 * 
 * i * i <= num stops the loop after the square root, reducing unnecessary
 * iterations.
 * 
 * Example:
 * 
 * If num = 25:
 * 
 * i = 5 → 5 * 5 <= 25 → true
 * 
 * 25 % 5 == 0 → Not a prime number.
 * 
 * i = 6 → 6 * 6 <= 25 → false
 * 
 * Difference:
 * 
 * i <= num / 2 checks more numbers.
 * 
 * i * i <= num checks fewer numbers and is more efficient.
 * 
 * Time Complexity: O(√n)
 * 
 */