
public class P03_ArrayForEach {

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        for (int num : numbers) {
            System.out.println(num);
        }

    }

}

/*
 * 
 * Normal for loop :
 * 
 * 1] Index मिळतो
 * 
 * 2] arr[i] वापरतो
 * 
 * 3] Element update करणे शक्य
 * 
 * //////////////////////////
 * 
 * Enhanced for loop
 * 
 * 1] Direct element मिळतो
 * 2] num वापरतो
 * 3] Direct index access नाही
 * 
 * ////////////////////////////
 * 
 * 
 * 
 */