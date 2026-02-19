public class Task30_ValidEmailMethod2 {
    //Write a program to validate an email address using String.matches()
    public static void main(String[] args) {

        String email = "";

        if(email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {

            System.out.println("Valid Email Address");
        } else {
            System.out.println("Invalid Email Address");
        }
        }
    }

