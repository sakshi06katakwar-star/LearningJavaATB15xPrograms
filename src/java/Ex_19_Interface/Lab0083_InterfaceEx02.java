package Ex_19_Interface;
interface B1 {
    void m1();
    static void m2() {System.out.println("m2 of B1");}
    int a =10;
}
interface B2 {
    void m2();
}
interface B3 {
    void m3();
}

class C1 implements B1,B2,B3 {
    public void m1() {System.out.println("m1 of B1");}
    public void m2() {System.out.println("m2 of B2");}
    public void m3() {System.out.println("m3 of B3");}

}

public class Lab0083_InterfaceEx02 {
    public static void main(String[] args) {
        System.out.println(C1.a);
        C1 obj1 = new C1();
        obj1.m1(); obj1.m2(); obj1.m3();
    }
}
