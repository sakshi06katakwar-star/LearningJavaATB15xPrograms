package Ex_21_ExceptionHandling;

public class Lab0088_RunTimeException {
    //Run time excep is parent for ArithmeticException,NumberFormatException,NullPointerException and ClassCaste
// Exception so all these excep can be handled using Runtime excep also.
    public static void main(String[] args) {
        System.out.println("Pgm starts");
        int a = 24;
        try {
            a = 24/0;
        }
        catch (RuntimeException rte) {
            System.out.println("Handling Runtime exception");
            rte.printStackTrace();
        }
        System.out.println("Pgm ends");
    }
}
//Same for runtime, Exception is parent so Runtime can be handled using exception class also.
//For everyone Throwable is super most class so all the exceptions can be handled using Throwable kw.
//for ex. catch(Exception e) and catch(Throwable t)
//If we don't have Arithmatic exc catch block it will go to Runtime exc but if we don't have runtime it will go to
//Exception and even if we don't have Exception catch block then it will be handled by Throwable catch block.