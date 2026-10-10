
//Problem Statement : Write a Java program to read an integer from the user and display the same integer as output.

import java.util.Scanner;

public class P02_DisplayInteger {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter the Integer : ");
        long number = sobj.nextLong();

        System.out.println("Integer is : " + number);

    }

}
