
// class And objects
/*

class is a blueprint or template used to create objects. 

class Employee {

    int id;
    String name;
    double salary;

}

Object is the instance of class

*/

class Employee {

    int id;
    String name;
    double salary;
}

public class Class {

    public static void main(String[] args) {
        Employee emp1 = new Employee();

        emp1.id = 101;
        emp1.name = "Anjali";
        emp1.salary = 25000;

        System.out.println(emp1.id);
        System.out.println(emp1.name);
        System.out.println(emp1.salary);
    }

}
