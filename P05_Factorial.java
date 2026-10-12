
//Find the Factorial of a Number

import java.util.Scanner;

public class P05_Factorial {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a non-negative number : ");
        int n = sobj.nextInt();

        long factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of a Number : " + factorial);

    }
}