import java.lang.reflect.Method;

class Animal {

    void sound() {
        System.out.println("Animal Makes Sound");
    }
}

class Dog extends Animal {
    @Override

    void sound() {
        System.out.println("Dog barks");

    }

}

public class Method_Overriding {

    public static void main(String[] args) {
        Animal aobj = new Dog();
        aobj.sound();
    }

}
// Dog barks



2. Important points


1. Method Overriding साठी inheritance आवश्यक आहे.
2. Parent आणि child method चे नाव व parameters समान असतात.
3. @Override annotation वापरतो.
4. Runtime ला कोणती method execute होईल हे actual object ठरवतो. याला Runtime Polymorphism म्हणतात.



Overloading	                                      Overriding
Same method name, different parameters        	Same method name and parameters
Inheritance required नाही	                      Inheritance required
Compile-time polymorphism                	    Runtime polymorphism


Because the actual object is Dog, 
Java calls the overridden method of the Dog class at runtime,
 even though the reference type is Animal. 
 This is called Runtime Polymorphism


/*








*/