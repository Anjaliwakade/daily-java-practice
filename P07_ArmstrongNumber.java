
//Write a Java program to check whether a given number is an Armstrong number.

import java.util.Scanner;

public class P07_ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sobj.nextInt();

        if (num < 0) {
            System.out.println("Not an Armstrong number");
            sobj.close();
            return;
        }

        int temp = num;

        int count = 0;

        do {
            count++;
            temp = temp / 10;

        } while (temp != 0);

        temp = num;
        int sum = 0;

        do {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, count);
            temp = temp / 10;
        } while (temp != 0);

        if (num == sum) {
            System.out.println("armstrong number");
        } else {
            System.out.println("Not an armstrong number");
        }

    }

}
