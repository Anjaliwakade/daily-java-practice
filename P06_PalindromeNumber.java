//Write a Java program to check whether a given number is a palindrome.

//A palindrome number reads the same forward and backward.

import java.util.Scanner;

public class P06_PalindromeNumber {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sobj.nextInt();

        int temp = num;
        int reverse = 0;
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        if (num == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

    }

}
