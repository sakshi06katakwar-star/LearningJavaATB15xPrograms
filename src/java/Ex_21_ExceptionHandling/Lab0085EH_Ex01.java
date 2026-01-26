package Ex_21_ExceptionHandling;

public class Lab0085EH_Ex01 {
    //Abnormal Condition - when we write the code that is called compilation and when we run the code that is called
    //execution so when we get an error during execution that is called as Abnormal Condition.
    //for ex.
    public static void main(String[] args) {
        System.out.println("Pgm starts");
    //  int a = 25/0;
    //here we are not getting exception while comlilation but during execution we are getting exception this is
   // Abnormal Condition
        int a = 25/5;
        System.out.println(a);
        int b = Integer.parseInt("25");
     //   int b= Integer.parseInt("Hi");  Abnormal Condition
        System.out.println(b);
//we cannot store string into integer.
        int d[] = {7,8,9};
        System.out.println(d[2]);
     //   System.out.println(d[3]);  Abnormal Condition
        //we can handle the exception and continue execution which is called Exception Handling.



    }
}
