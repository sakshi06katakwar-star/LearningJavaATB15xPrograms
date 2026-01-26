package Ex_21_ExceptionHandling;

public class Lab0087TryCatch_Ex02 {
    //We can have multiple catch blocks in our code -
    public static void main(String[] args) {
        System.out.println("Pgm starts");
        int a = 24;
        try {
            a = 24/0;
        }
        catch (ArithmeticException ae) {
            System.out.println("Handling Arithmetic exception");
            ae.printStackTrace();
        }
        catch (NumberFormatException nfe) {
        System.out.println("Handling NumberFormat exception");
        nfe.printStackTrace();
        }
        catch (NullPointerException npe) {
            System.out.println("Handling NullPointer exception");
            npe.printStackTrace();
        }
        System.out.println("Pgm ends");
} }
//we cannot write any line of code in between try catch block.
//we cannot write any line of code in between catch blocks.
//Checked Exceptions are found during compilation time only and they can be handled through try catch block or
//throw kw but mandator we have to use throw kw to handle it.
//Unchecked exceptions are found during compilation and they can be handled using try catch block alone.
//For all the errors Exception is the parent class and Throw is class above all exception classes.
//Run time excep is parent for ArithmeticException,NumberFormatException,NullPointerException and ClassCaste
// Exception so all these excep can be handled using Runtime excep also.
//