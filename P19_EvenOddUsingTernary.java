
import java.util.Scanner;

public class P19_EvenOddUsingTernary {

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the integer : ");
        int number = sobj.nextInt();

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(result);

        sobj.close();
    }

}
