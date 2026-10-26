
/*
Day 13 — Find Duplicate Characters in a String
Problem:
Write a Java program that accepts a line of text 
and displays each character that appears more than once,
 along with its number of occurrences.

*/

import java.util.Scanner;

public class P13_FindDuplicateCharacters {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sobj.nextLine();
        boolean foundDuplicate = false;

        for (int i = 0; i < str.length(); i++) {
            boolean appearedEarlier = false;
            int count = 0;

            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            }

            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    appearedEarlier = true;
                    break;
                }
            }

            if (appearedEarlier) {
                continue;
            }

            for (int k = 0; k < str.length(); k++) {
                if (str.charAt(k) == ch) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(ch + " : " + count);
                foundDuplicate = true;
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate characters found.");
        }

        sobj.close();
    }
}