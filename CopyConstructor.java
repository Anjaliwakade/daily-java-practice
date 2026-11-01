// java doesnt have build in copy constructor but we can create it also. 

//A copy constructor is a user-defined constructor that creates a new object by copying the values of another object of the same class. Java does not provide a built-in copy constructor.
public class CopyConstructor {

}

class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy Constructor
    Student(Student s) {
        this.id = s.id;
        this.name = s.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul");

        Student s2 = new Student(s1);

        s1.display();
        s2.display();
    }
}