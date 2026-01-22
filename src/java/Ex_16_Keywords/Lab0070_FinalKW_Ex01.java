package Ex_16_Keywords;
//Final KW at variable level -

public class Lab0070_FinalKW_Ex01 {
  final static int a = 40;
   final int c = 50;

    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        a = 20;
        System.out.println(a);
        final int b = 30;
        System.out.println(b);
        System.out.println(Lab0070_FinalKW_Ex01.a);
        Lab0070_FinalKW_Ex01 obj = new Lab0070_FinalKW_Ex01();
        System.out.println(obj.c);

   //     Lab0070_FinalKW_Ex01.a = 60;
     //                    obj.c = 70;


    }//We cannot further more assign the value for b like a because we have made it final.
    //since static int a = 40 and int c = 50 having final kw their values cannot be re-assigned.
    //hence  line no. 18 & 19 will through an error.

}
