public class P18_Operators {

    public static void main(String[] args) {

        // Arithmetic opeartors
        int a = 10;
        int b = 5;

        System.out.println(a + b); // 15
        System.out.println(a - b); // 5
        System.out.println(a * b); // 50
        System.out.println(a / b); // 2
        System.out.println(a % b); // 0

        // Realtional Operator

        int a = 10;
        int b = 20;

        System.out.println(a > b); // false
        System.out.println(a < b); // true
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a >= b); // false
        System.out.println(a <= b); // true

        // Logical operatgors in java

        int age = 25;

        System.out.println(age > 18 && age < 60); // true
        System.out.println(age < 18 || age > 60); // false
        System.out.println(!(age > 18)); // false

        // && - AND - both condition must be true

        // || - OR - one condition must be true

        // ! - NOT - result is reversible

        // Assignment Operator

        // Used to update or assign the value

        int a = 10;

        a += 5; // a = a + 5 → 15
        a -= 3; // a = a - 3 → 12
        a *= 2; // a = a * 2 → 24
        a /= 4; // a = a / 4 → 6
        a %= 4; // a = a % 4 → 2

        System.out.println(a);

        // Increment & Decrement Operators

        // ++ - value is increased by one
        // -- - value is decreased by one

        int a = 10;

        a++;
        System.out.println(a); // 11

        a--;
        System.out.println(a); // 10

        // Pre-increment vs Post-increment

        int a = 5;

        System.out.println(a++); // 5 (नंतर a = 6)
        System.out.println(++a); // 7 (आधी a = 7)
        System.out.println(a); // 7

        // Next: Ternary Operator (? :)

        int age = 20;

        String result = (age >= 18) ? "Eligible" : "Not Eligible";

        System.out.println(result);

        // Eligible

        // Condition true असेल → "Eligible"

        // Condition false असेल → "Not Eligible"

    }

}
