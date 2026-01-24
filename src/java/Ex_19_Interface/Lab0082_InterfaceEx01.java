package Ex_19_Interface;
interface A1 {
    void m1();
    void m2();
    static void m3() {
        System.out.println("m3 of A1");
    }
    interface A2 extends A1 {
        void m4();
    }
    interface A3 {
        static void m5() { System.out.println("m5 of A3"); }
    }
    interface A4 extends A3,A2 {
    }
    abstract class B1 implements A4 {
        abstract void m6();
    }

    public class Lab0082_InterfaceEx01 {
        void m6 () {System.out.println("m6 of B1");}
        void m4 () {System.out.println("m4 of A2");}
        void m2 () {System.out.println("m2 of A1");}
        void m1 ()  {System.out.println("m1 of A1");}

        public static void main(String[] args) {
            Lab0082_InterfaceEx01 obj1 = new Lab0082_InterfaceEx01();
            A1.m3();
            A3.m5();
            obj1.m1(); obj1.m2(); obj1.m4(); obj1.m6();
        }
    }
}
//Interface starts with kw Interface.
//It cannot have complete methods by default all the methods are abstract here. we cannot give body to the interface.
//Its not mandatory to give abstract kw before methods in interface because by default all the methods are abstract in
//interface.
//we can have static methods in interface.
//Inheritance is possible in interface using extends kw.
//Implements kw is used for inheritance from class to interface.
//When we make abstract methods as complete which are in interface then we have to use kw as public.
//Static methods in interface can only access with that interface name only even if its extending.
//Multiple inheritance is possible only in interface for ex. interface A3 extends A2,A1
//Interface cannot have constructor.
//It can have variables but var is final it cannot be reassigned and always be static even if we don't give static kw.
//