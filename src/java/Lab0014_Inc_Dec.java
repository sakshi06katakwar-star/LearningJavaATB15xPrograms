public class Lab0014_Inc_Dec {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);//22
        System.out.println(a);//12
        System.out.println(a++);//12
        System.out.println(a);//13
        System.out.println(++a);//14
        System.out.println(a);//14
        System.out.println(a++ + ++a);//30

    }
}
