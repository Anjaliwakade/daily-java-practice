
/*
Constructor is initialized when object is created

*/

class Employee {

    int id;
    String name;

    // Parametrized Constructor
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Constructor {

    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Anjali");

        System.out.println(emp1.id);
        System.out.println(emp1.name);
    }

}

/*
 * 
 * 
 * 
 * Employee() = Constructor
 * 
 * 
 * 
 * this.id = Current object's id
 * 
 * 
 * 
 * this.name = Current object's name
 * 
 * Constructor :
 * 1] Name is same as Class name
 * 2] no return type.
 * 3] Object initialization
 * 4] it is initialized or call when object is created
 * 
 * it has types -
 * 
 * 1] default 2] No-Argument 3] parametrized
 * vs
 * 
 * Method :
 * 1] any Valid name
 * 2] it has return type or void
 * 3] it can perform specific task
 * 4] call when needed
 * 
 */