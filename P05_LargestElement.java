
import java.util.Scanner;

public class P05_LargestElement {

    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the length : ");
        int length = sobj.nextInt();

        int arr[] = new int[length];

        System.out.println("Enter the elements : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sobj.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest : " + max);
        sobj.close();

    }

}
