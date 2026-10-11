//Find sum of digits

import java.util.Scanner;

public class P04_SumOfDigits {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter the Positive number : ");
        int num = sobj.nextInt();

        int iSum = 0;

        while (num != 0) {
            int digit = num % 10;
            iSum = iSum + digit;

            num = num / 10;
        }

        System.out.println("Sum of digits : " + iSum);
    }

}
