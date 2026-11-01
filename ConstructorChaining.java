
//Constructor Chaining – this() and  super()

//this() - it can call another constructor from the same class.

class Employee {

    Employee() {
        this(101);
        System.out.println("No-arg constructor");
    }

    Employee(int id) {
        System.out.println("ID: " + id);
    }
}

/*
 * Output:
 * ID: 101
 * No-arg constructor
 * 
 */

//////////////////////////

// super()

class Parent {

    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {

    Child() {
        super();
        System.out.println("Child constructor");
    }

    public static void main(String[] args) {
        Child obj = new Child();
    }
}

//////////////////////////////////////////

public class ConstructorChaining {

}
