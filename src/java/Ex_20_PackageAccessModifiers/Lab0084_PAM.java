package Ex_20_PackageAccessModifiers;

public class Lab0084_PAM {
    //How we write these modifiers?
     public int a_public = 10;
     protected int b_protected = 20;
     int c_default = 30;
     private int d_private = 40;

    public static void main(String[] args) {
        Lab0084_PAM obj = new Lab0084_PAM();
        System.out.println(obj.a_public);
        System.out.println(obj.d_private);
        System.out.println(obj.c_default);
        System.out.println(obj.b_protected);
    }
}
