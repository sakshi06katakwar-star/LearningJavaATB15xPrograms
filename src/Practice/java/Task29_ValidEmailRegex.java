import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task29_ValidEmailRegex {
    //Write a program to validate an email address using regex pattern matching.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a email : ");
        String email = sc.nextLine();

        // Regex pattern for email validation
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        // Compile the pattern
        Pattern pt = Pattern.compile(regex);

        // Match the input email with pattern
        Matcher mt = pt.matcher(email);

        if(mt.matches()) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
            sc.close();
        }



    }
}
