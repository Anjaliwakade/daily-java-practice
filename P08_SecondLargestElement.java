
import java.util.Scanner;

public class P08_SecondLargestElement {

    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the length:");
        int length = sobj.nextInt();

        int arr[] = new int[length];

        System.out.println("Enter the elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sobj.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Second largest element does not exist");
        } else {
            System.out.println("Second largest is: " + secondMax);
        }

        sobj.close();
    }
}

/*
 * 
 * 
 * 
 * 4. Interview concepts
 * - Time Complexity: O(n)
 * - Space Complexity: O(1)
 * - Duplicate maximum values are ignored.
 * - Negative numbers are also handled.
 * 
 */
