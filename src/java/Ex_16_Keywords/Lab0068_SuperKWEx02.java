package Ex_16_Keywords;

import java.text.DecimalFormat;

class B1 {
     B1( int a) { System.out.println("int A1 const=> "+ a);}
     B1 (String a) { System.out.println("string A1 constr=> "+a);}

}
class B2 extends B1 {
     B2 (Boolean b, int b1) {
         super("Hello");
        System.out.println("boolean and int const=> "+b+"===="+ b1);}
    B2(){
         super(20) ;
         System.out.println("default B2 const");}
    B2(int b) {
         super(10);
        System.out.println("int B2 const=> "+ b);
    }
}
public class Lab0068_SuperKWEx02 {
    public static void main(String[] args) {
        System.out.println("pgm starts");
        B2 obj  = new B2(20);
        System.out.println("pgm ends");
    }

}//the limitation in super kw is that we can call only 1 const at a time.
