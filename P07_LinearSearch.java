
import java.util.Scanner;

public class P07_LinearSearch {

    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the length of the array : ");
        int length = sobj.nextInt();

        int arr[] = new int[length];

        System.out.println("Enter the elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sobj.nextInt();
        }

        System.out.println("Enter the target element");
        int target = sobj.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index : " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

    }

}

/*
 * 
 * 
 * - main() method योग्य वापरली.
 * - nextInt() योग्य लिहिलं.
 * - break योग्य ठिकाणी वापरलं.
 * - boolean found वापरून not-found condition handle केली.
 * 
 * 
 * Interview मध्ये लक्षात ठेव
 * 
 * Linear Search Time Complexity:
 * - Best Case: \(O(1)\) — पहिल्याच position वर element मिळाला.
 * - Worst Case: \(O(n)\) — शेवटपर्यंत शोधावा लागला किंवा element मिळाला नाही.
 * 
 * 
 * 
 * 
 * 
 */
