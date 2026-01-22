package Ex_16_Keywords;
class D1 {
    D1 () { System.out.println("default D1 const");}
    D1 (double a) {
        this();
        System.out.println("double D1 const=> "+a);}
}

class C1 extends D1 {
    C1 () {
        super(25.78);
        System.out.println("default C1 const");}

    C1 (int a) {
        this();
        System.out.println("int const=> "+a);}

    C1 (String a, String b) {
        this(30);
        System.out.println("String and String const=> "+a+" "+b);}

    C1 (boolean a, int b) {
        this("Welcome","Here");
        System.out.println("boolean and int const=> "+a+" "+b);}
}
public class Lab0069_ThisKW_Ex01 {
    public static void main(String[] args) {
        System.out.println("Pgm starts");
        C1 obj = new C1(true,30);
        System.out.println("Pgm ends");
    }
//The limitation in super kw is that we can call only 1 const at a time so if we want to call multiple const in 1 time
 //we use This KW so this kw is used to call own class const.
    // this kw is also 1st statement of const hence we can have either this or super kw in const.


}
