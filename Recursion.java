public class Recursion {

}

/*
 * 
 * Recursion म्हणजे एखादी method स्वतःलाच call करते.
 * 
 * class Main
 * {
 * static int factorial(int n)
 * {
 * if(n == 1)
 * {
 * return 1;
 * 
 * }
 * 
 * return n * factorial(n - 1);
 * 
 * }
 * 
 * 
 * public static void main(String[] args)
 * {
 * System.out.println(factorial(5));
 * 
 * }
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * // How it works
 * 
 * Recursion in Java
 * 
 * 
 * 2. How it works?
 * factorial(5):
 * 5 * factorial(4)
 * 5 * 4 * factorial(3)
 * 5 * 4 * 3 * factorial(2)
 * 5 * 4 * 3 * 2 * factorial(1)
 * 5 * 4 * 3 * 2 * 1 = 120
 * 
 * 
 * Base Condition: Recursion थांबवण्याची condition. इथे n == 1.
 * 
 * 
 * 
 * Recursive Call: Method स्वतःलाच call करते. इथे factorial(n - 1).
 * 
 * Base condition नसेल तर StackOverflowError येऊ शकतो.
 * 
 * 
 * 
 * class Main {
 * 
 * static int sum(int n) {
 * 
 * if (n == 1) {
 * return 1;
 * }
 * 
 * return n + sum(n - 1);
 * }
 * 
 * public static void main(String[] args) {
 * System.out.println(sum(5));
 * }
 * }
 * 
 * 
 * 
 * 
 * return 1 हे फक्त 1 return करत नाही, तर आधी थांबलेल्या recursive calls ना
 * त्यांची calculation पूर्ण करण्यासाठी value देते.
 * 
 * यालाच Unwinding of Recursion म्हणतात.
 * 
 * /////////////////////////////////////////
 * 
 * 
 * 
 * 
 */
