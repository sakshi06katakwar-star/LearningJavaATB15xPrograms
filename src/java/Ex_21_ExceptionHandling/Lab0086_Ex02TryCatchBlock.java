package Ex_21_ExceptionHandling;

public class Lab0086_Ex02TryCatchBlock {
    //We can handle the exception and continue execution which is called Exception Handling.
    //How can we handle exception? -
    public static void main(String[] args) {
        System.out.println("Pgm starts");
        int a = 3;
        try {
            // a = 100/0; //Abnormal condition
            a = 100/2; //if there is not any error catch block is not executed.
        }//the place where we might get an error is written inside try block.
        catch(ArithmeticException b) { //variable b is going to catch the exception.
            System.out.println("Handling error");
            b.printStackTrace();//this gives complete info of error and not mandatory to write.
        }//if there is any erroe in try block it will be handled by catch block.

        System.out.println(a);//value of a is 50 as  a=100/2;
        System.out.println("Pgm ends");

    }
}
