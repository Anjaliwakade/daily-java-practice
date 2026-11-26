
import java.util.Scanner;

public class P06_SmallestElement {

    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the length of array :");
        int length = sobj.nextInt();

        int arr[] = new int[length];

        System.out.println("Enter the elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sobj.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Smallest : " + min);
        sobj.close();

    }

}
