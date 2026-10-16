
//Write a Java program to accept a string from the user and print the string in reverse order.

import java.util.Scanner;

public class P09_ReverseString {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            rev = rev + ch;

        }

        System.out.println(rev);
    }
}

// I reversed the string by traversing it from the last character to the first
// character.

////////////////////////////////////////////////////////