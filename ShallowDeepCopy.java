public class ShallowDeepCopy {

    }

    /*
     * 
     * Shallow copy creates a new object but shares references to nested objects.
     * 
     * 
     * 
     * Deep copy creates a new object and also creates independent copies of its
     * nested objects.
     * 
     * 
     * Code काय होतं?
     * Student s1 = new Student(); नवीन object तयार
     * Student s2 = s1; Reference copy होतो
     * Student s2 = new Student(s1); Copy Constructor वापरून नवीन object तयार
     * 
     * It has two parts:
     * - First Address = class name / data type.
     * - Second address = reference variable name.
     */

    // address can hold a reference to an Address object.

    Address a1 = new Address();

    a1 is
    a refernce
    variable.it refers
    tot he
    Address
Object
    created by new()

    Address().



Step 3: Connect Address with Student


Address a1 = new Address();
a1.city = "Pune";

Student s1 = new Student();
s1.id = 101;
s1.address = a1;

It means: Student s1's address reference will point to the same Address object as a1.


Both a1 and s1.address point to the same Address object.

Then:
s1.address.city = "Mumbai";

////////////////////

Therefore:
System.out.println(a1.city);


Output:
Mumbai

/////////////////////////

Step 4: Now let's connect this to Shallow Copy

Student(Student s)
{
    this.id = s.id;
    this.address = s.address;
}

Address a1 = new Address();a1.city="Pune";

Student s1 = new Student();s1.id=101;s1.address=a1;

Student s2 = new Student(s1);

///////////////////////////////

s2.address.city="Mumbai";

System.out.println(s1.address.city); // mumbai

/////////////////////////

Remember-
New Student object?Yes-
New Address object?No-
Both students
share one
Address object?
Yes
This
is called
Shallow Copy.

///

Easy trick:-
Shallow Copy→
Object reference
is shared.-

Deep Copy→
Nested object
is copied too.

//////////////////////////////

