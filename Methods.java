public class Methods {
    static void greet() {
        System.out.println("Hello Anjali!");
    }

    public static void main(String[] args) {
        greet();
        greet();
    }

}

/*
 * A Method is Block of code that performs a specific task. we use methods to
 * avoid
 * repeating codes and make programs reusable
 * 
 * greet() — Method name
 * static — Object न बनवता method call करता येते.
 * void — Method कोणतीही value return करत नाही.
 * greet(); — Method calling.
 * 
 * 
 * Code reusability
 * Code readability
 * Easy maintenance
 * Avoid code duplication
 * 
 * 
 * Question: Create a method named displayMessage() that prints:
 * 
 * class main{
 * static void displayMessage()
 * {
 * System.out.println("Welcome to Java Programming!");
 * 
 * }
 * public static void main(String[] args)
 * {
 * displayMessage();
 * 
 * }
 * 
 * }
 * 
 * 
 * ///////////////////////////////////////
 * 
 * 
 * 
 * Question: Create a method calculateSquare(int number) which returns the
 * square of a number.
 * 
 * 
 * class main{
 * 
 * static int calculateSquare(int number)
 * {
 * int square = number * number;
 * 
 * return square;
 * 
 * }
 * 
 * public static void main(String[] args)
 * {
 * 
 * int num = 5;
 * 
 * int square = calculateSquare(num);
 * 
 * System.out.println(square);
 * 
 * 
 * 
 * }
 * 
 * }
 * 
 * 
 * 
 * Q. What is the difference between void and return?
 * 
 * Simple English answer:
 * 
 * void means a method does not return any value.
 * return sends a value back from a method.
 * 
 * 
 */
