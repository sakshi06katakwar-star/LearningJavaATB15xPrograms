package Ex_21_ExceptionHandling;

public class Lab0089_ThrowableEx {
    //If we don't have Arithmatic exc catch block it will go to Runtime exc but if we don't have runtime it will go to
//Exception and even if we don't have Exception catch block then it will be handled by Throwable catch block.
    //but always the sequence should be the same.
    public static void main(String[] args) {
        System.out.println("Pgm starts");
        int a = 24;
        try {
            a = 24/0;
        }
    //    catch (ArithmeticException ae) {
    //        System.out.println("Handling Arithmetic exception");
    //        ae.printStackTrace();
    //    }
      //  catch (Exception nfe) {
      //      System.out.println("Handling NumberFormat exception");
     //       nfe.printStackTrace();
    //    }
        catch (Throwable npe) {
            System.out.println("Handling Throwable");
            npe.printStackTrace();
        }
        System.out.println("Pgm ends");
    } }

