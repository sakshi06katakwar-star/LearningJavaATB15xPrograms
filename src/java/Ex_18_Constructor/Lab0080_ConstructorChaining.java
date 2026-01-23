package Ex_18_Constructor;

class Student {

    Student() {
        this(10);   // calls Student(int)
        System.out.println("Default constructor");
    }

    Student(int id) {
        this("Sakshi");  // calls Student(String)
        System.out.println("ID constructor: " + id);
    }

    Student(String name) {
        System.out.println("Name constructor: " + name);
    }
}

public class Lab0080_ConstructorChaining {
    public static void main(String[] args) {
        Student s = new Student();
    }
}
//Constructor chaining means calling one constructor from another constructor in the same class or from a parent
// class.

//Java allows constructor chaining to -
// Reuse code
//Avoid duplicate initialization
//Maintain proper object creation flow

//Types of Constructor Chaining
//There are two ways:
//Using this() → calls another constructor of the same class
//✔ this() must be the first statement inside the constructor
//✔ Used to call another constructor of the same class

//Using super() → calls constructor of the parent class
//Used when inheritance is involved.
//✔ super() must be the first statement
//✔ If not written, Java automatically inserts super()

//
