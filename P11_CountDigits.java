
//Write a Java program to count the number of digits in a given integer.

import java.util.Scanner;

public class P11_CountDigits {

    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number");
        String str = sobj.nextLine();

        int count = str.length();

        System.out.println("number of digits : " + count);
    }

}
