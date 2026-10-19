
//Write a Java program to accept a string from the user and count the total number of vowels (a, e, i, o, u) in the string.

import java.util.Scanner;

public class P10_CountVowels {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            ch = Character.toLowerCase(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;

            }
        }

        System.out.println("Total vowels : " + count);

    }

}
