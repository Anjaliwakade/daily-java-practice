// this means reference of current object.

class Employee {

    int id;
    String name;

    // Parametrized Constructor
    Employee(int id, String name) {
        this.id = id; // this keyword
        this.name = name;
    }
}

public class This {

    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Anjali");

        System.out.println(emp1.id);
        System.out.println(emp1.name);
    }

}
