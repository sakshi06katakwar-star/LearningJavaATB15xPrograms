import java.util.Scanner;

public class Task04_PalindromeStringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");

        String original = scanner.nextLine();

        // Using StringBuilder
        StringBuilder sb = new StringBuilder(original);
//      StringBuilder sb = new StringBuilder("madam"); Now sb contains reversed text.
        // Reverse the string
        sb.reverse();
        String reversed = sb.toString(); //toString()👉 Converts StringBuilder into String and Returns a String value

        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is NOT a Palindrome");
        }

        scanner.close();
    }
}
