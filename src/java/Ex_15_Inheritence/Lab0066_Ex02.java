package Ex_15_Inheritence;

class B1 {
    int a = 100;
    int b = 200;
    void m1() { System.out.println("m1 method of B1");}
}//here if we make a and b static at parent level but they are non static at child level they will be accepted
//as non static because preference is given to child class.

class B2 extends B1 {
    int a = 500;
    int b = 600;
    void m1() { System.out.println("m1 method of B2");}
}

public class Lab0066_Ex02 {
        public static void main(String[] args) {
            B2 obj1 = new B2();
            System.out.println(obj1.a);
            System.out.println(obj1.b);
            obj1.m1();

            B1 obj2 = new B2();
//creating an obj for B2 class but reference is B1 class -
            //only members of parent class alone will  participate.
            //any non static METHOD coming from child class will override.

            System.out.println(obj2.a);
            System.out.println(obj2.b);
            obj2.m1();

        }
    } //here void m1() method is present in both child and parent class and that's why it is overrided.
//Method level If I make void m1() static at parent level but not at child level it will through an error.
//If parent is non static child should also be non static.



