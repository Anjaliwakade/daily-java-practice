import java.util.Scanner;

public class P14_FindDuplicateCharacters {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sobj.nextLine();

        int[] frequency = new int[Character.MAX_VALUE + 1];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                frequency[ch]++;
            }
        }

        boolean foundDuplicate = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ' && frequency[ch] > 1) {
                System.out.println(ch + " : " + frequency[ch]);
                frequency[ch] = 0; // so it does not print again
                foundDuplicate = true;
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate found");
        }

        sobj.close();
    }
}