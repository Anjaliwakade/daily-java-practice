public class LiniearSearch {

    int arr[] = { 10, 20, 30, 40, 50 };
    int target = 30;

    for(
    int i = 0;i<arr.length;i++)
    {
        if (arr[i] == target) {
            System.out.println("Element found at index : " + i);
        }

        break;
    }

}

// Element found at index: 2

/*
 * 
 * Liniear Search in Array :
 * 
 * each element is check.
 * 
 * its work on sorted and unsorted array.
 * 
 * time complexity : O(n)
 * 
 * 
 * Element सापडल्यावर break वापरून loop थांबवू शकतो.
 * 
 */