package Ex_16_Keywords;
// Final KW at method level -

class F1 {
    final static int a = 65;
    final void m1() {
            System.out.println("m1 method of F1");
        }
}
class F2 extends F1 {
    static int a = 66;
  //  void m1() {
        void m2() {
        System.out.println("m1 method of F2");
    }
}
public class Lab0072_FinalKW_Ex03 {
        public static void main(String[] args) {
            F2 obj1 = new F2();
            obj1.m2();
            System.out.println(obj1.a);
            //it can also be called as System.out.println(F2.a);
            System.out.println(F1.a);
     //       F1.a = 70;
        }

    }//here already we have made m1 method as final hence we cannot override it else it will
// through an error that's why in line no. 13 we have changed m1 to m2 but if we are not using final kw then method can be
// overrided.
//variable level even if we have made int a as final its not overriding. its printing 66. only their value cannot
//be reassigned means if I give F1.a = 70 it will through an error.

