package Ex_16_Keywords;

class A1 {
        A1 () { System.out.println("Default A1 const");}
        A1 (int a) { System.out.println("Int A1 const=> "+ a); }
    }
     class A2 extends A1 {
        A2() {
            super();
            System.out.println("Default A2 const"); }
        A2 (int a, boolean b) {
            super(100);
            System.out.println("int and boolean const=> "+ a+"===="+ b); }
    }
    class A3 extends A2 {

    }
public class Lab0067_SuperKW {
        public static void main(String[] args) {
            System.out.println("Pgm starts");
        //    A2 obj1 = new A2();
            A3 obj2 = new A3();
            System.out.println("Pgm ends");
        }
    }

//1.In line no.20 we have not pass any argument in A2() hence it will go to line no.9.
//2. But it has extends keyword so by default JVM will have a Super kw to call supr class empty constr and hence
//it will call A1 class default const.
//3.If we don't have anything in class then by default JVM will have an empty constr.
//4.If we do not write supey kw in line no.10 JVM itself will write super  kw to call parent class empty const.
//5.We have to match the argument of super kw with the parent class constr.
//6.Crux - As we have created an obj for A2 so from line no.21 control will go to 8 and here it will see an extends
//kw so to call parent class i.e, A1 default const we will or if we will not then JVM will write super kw and
//then it will print pgm starts, Default A1 const, Default A2 const, pgm ends
//7.If we create an obj for A3 then as A3 having nothig so JVM will create a default const with super kw. and it
//will call default const of A2 class and here in A@ it sees an extends kw so it will call default const of A1 class.

//Super kw is always 1st statement of const hence we cannot have multiple super kw in a single class.