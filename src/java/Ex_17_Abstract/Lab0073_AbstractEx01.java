package Ex_17_Abstract;

abstract class A1 {
    abstract void m1 (int a );
    abstract int m2 ();
}
 class A2 extends A1 {
    void m1(int a) {
        System.out.println("m1 of A2=> "+a);
    }

    int m2() {
        System.out.println("m2 of A2");
        return 100;
    }

    String m3(String a) {
        System.out.println("m3 of A2=> "+a);
        return "Welcome";
    }
}

public class Lab0073_AbstractEx01 {
    public static void main(String[] args) {
        A2 obj1 = new A2();
        obj1.m1(50);
        obj1.m2();
        obj1.m3("Java");

    }
}
    //A method which does not have a body is calles as Abstract method.
    //for ex. void m1() {system.out.println("m1 method");} this is body of a method ecause this is the way we write
    //any method which is also called as complete or concrete method.
    //void m1(); this is an incomplete or abstract method.
    //abstract methods has to be followed by a kw called abstract ex. abstract void m1();
    //If a class has atleast 1 method as abstract then that class also has to be represented as abstract ex.

    //abstract class A1 {
    //                    void m1() {system.out.println("m1 method");}
    //                    abstract void m1(); }
    //An object cannot be created for an abstract clas.
    //To create an object for abstract class we have to make methods as complete.
    //complete class can be made as an abstract so that no one can make an obj for my class and access it.
    //Abstract methods cannot be static they are always non static.
    //Abs methods can accept arguments and can have return type also means they can return a value.
    //

