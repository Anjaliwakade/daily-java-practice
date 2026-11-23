public class Method_Overloading {

    static int add(int a, int b) {
        return a + b;

    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
        System.out.println(add(10.5, 20.5));
    }

}
/*
 * 
 * When multiple methods have the same name but different parameters in the same
 * class, it is called Method Overloading.
 * 
 * 
 * 
 * Important Interview Points
 * Method Overloading वेगवेगळ्या प्रकारे होऊ शकतं:
 * 1. Different number of parameters.
 * 2. Different data types of parameters.
 * 3. Different order of parameter types.
 * 
 * 
 * फक्त return type बदलून Method Overloading होत नाही.
 * 
 * एकाच class मध्ये multiply() नावाचे 3 methods तयार कर:
 * 
 * 
 * class Main{
 * 
 * static int multiply(int num1 , int num2)
 * {
 * int multi = num1 * num2;
 * return multi;
 * 
 * }
 * 
 * static int multiply(int num1 , int num2 , int num3)
 * {
 * int multiTwo = num1 * num2 * num3;
 * return multiTwo;
 * 
 * }
 * 
 * static double multiply(double num1 , double num2)
 * {
 * double multiThree = num1 * num2;
 * return multiThree;
 * 
 * }
 * 
 * public static void main(String[] args)
 * {
 * 
 * 
 * int multi = multiply(2 , 4);
 * int multiTwo = multiply(1 , 2, 3);
 * double multiThree = multiply(4.2 , 2.4);
 * 
 * System.out.println(multi);
 * System.out.println(multiTwo);
 * System.out.println(multiThree);
 * 
 * }
 * 
 * 
 * }
 * 
 * Q. Can we overload a method by changing only its return type?
 * 
 * No. We cannot overload a method by changing only the return type. Parameters
 * must be different.
 * 
 * ////////////////////////////////////////
 * 
 * 
 * 
 */