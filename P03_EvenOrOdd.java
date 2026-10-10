/*

Write a Java program that reads an integer N and checks whether it is even or odd.


*/

import java.util.Scanner;

public class P03_EvenOrOdd {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        long n = sobj.nextLong();

        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }

}
