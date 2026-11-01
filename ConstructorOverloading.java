
/*
multiple constructor with different paramaneters in same class.


*/
class Employee {

    int id;
    String name;

    Employee() {
        id = 0;
        name = "Unknown";
    }

    Employee(int id) {
        this.id = id;
        name = "Unknown";
    }

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(101);
        Employee e3 = new Employee(102, "Anjali");

        e1.display();
        e2.display();
        e3.display();
    }
}
