
//Problem:
// Write a Java program that accepts an integer and counts how many of its digits are even and how many are odd.

// Treat the minus sign, if present, as part of the number’s sign—not as a digit. If the input is 0, count it as one even digit.

import java.util.Scanner;

public class P12_CountEvenOddDigits {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sobj.nextInt();

        if (num < 0) {
            num = -num;

        }
        if (num == 0) {
            System.out.println("Even digits : 1");
            System.out.println("Odd digits : 0");
            sobj.close();
            return;

        }

        int evenCount = 0;
        int oddCount = 0;

        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            num = num / 10;

        }

        System.out.println("Even digits : " + evenCount);
        System.out.println("Odd digits : " + oddCount);
        sobj.close();

    }

}
