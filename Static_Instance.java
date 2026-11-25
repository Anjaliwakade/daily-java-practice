//Static vs Instance Methods

Java मध्ये methods चे दोन महत्त्वाचे प्रकार:

1]Static Method

static keyword वापरतो.

Class च्या नावाने call करू शकतो.

Object create करण्याची गरज नाही.

class Student {

    static void display() {
        System.out.println("Hello Student");
    }

    public static void main(String[] args) {
        Student.display();
    }}

    //////////////////////

    2]

    Instance Method

static keyword नसतो.

    Call करण्यासाठी
    object create
    करावा लागतो.

    class Student {

        void show() {
            System.out.println("Instance Method");
        }

        public static void main(String[] args) {
            Student obj = new Student();
            obj.show();
        }
    }

    ////////////////////

    a

    static method cannot
    directly access
    a non-static variable 
because
    a non-
    static variable belongs
    to an object,
    and a
    static method belongs
    to the class.

    पण object
    create करून
    access करू शकतो.

    class Student {

        int age = 25;

        static void display() {
            Student sobj = new Student();
            System.out.println(sobj.age);
        }
    }

/////////////////////////////////


Can a
    static method be
    overridden in Java?

    Ans:No,
    static methods cannot
    be overridden
    in Java.

    //////////////////////////////////////////////

    // static methods cannot be overridden in Java.

    कारण static methods

    class शी
    संबंधित असतात, object
    शी नाही.

पण एक
    महत्त्वाची गोष्ट:Child

    class मध्ये
    same signature ची
    static method लिहिली
    तर त्याला
    Method Hiding म्हणतात,
    Overriding नाही.

    class Parent {

                static void show() {
                    System.out.println("Parent");
                }
            }

            class child extends Parent {
                static void show() {
                    System.out.println("Child");
                }
            }

            class Main {

                public static void main(String[] args) {
                    Parent pobj = new Child();
                    pobj.show();
                }
            }

            // Parent
            // कारण static method call reference type वर ठरतो.
            // Instance method - Overriding(Runtime)

            // Static methods cannot be overridden.
            // They can be hidden in the child class.

            ///////////////////////////////////

            // Pass by Value in Java

            // Java मध्ये arguments नेहमी Pass by Value ने pass होतात.

            म्हणजे method
            ला variable
            ची original
            value न
            देता तिची
            copy दिली जाते.

            class Main {

                static void change(int num) {
                    num = 100;
                }

                public static void main(String[] args) {
                    int value = 50;

                    change(value);

                    System.out.println(value);
                }
            }

            // 50

असं का?-value=50-

  change(value) केल्यावर number ला 50 ची copy मिळते.
- number = 100 केल्याने original value बदलत नाही.


///////////////////////////////////////////////

Does Java Support Pass by reference?


No, Java does not support Pass by Reference. Java always uses Pass by Value.
Java is always pass-by-value. For objects, a copy of the reference is passed.

            //////////////////////////////////////////

            static void change(int x) {
                x = 100;
            }

            public static void main(String[] args) {
                int a = 50;
                change(a);
                System.out.println(a);
}

/////////////////////////////////////////
