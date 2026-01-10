package EX_11_FunctionMethod;

public class Lab0050_FunctionEx02 {
    void m1() {
        System.out.println("m1 method");
    }
    static void m2() {
        System.out.println("m2 method");
    }
    int m3() {
        System.out.println("m3 int method");
        return 10;
    }
    boolean m4() {
        System.out.println("m4 boolean method");
        return false;
    }

    public static void main(String[] args) {
        Lab0050_FunctionEx02 obj = new Lab0050_FunctionEx02();//obj is created to call non-static method
        obj.m1();
        Lab0050_FunctionEx02.m2(); //best practice to call static method is with class name
       int a = obj.m3();
       boolean b = obj.m4();
        System.out.println(a);
        System.out.println(b);

    }
}
//m3 will return 10 and 10 will be stored in a and hence value of a=10 will be printed same with b.