import java.util.Scanner;

public class Task14_ReverseString {
    //Write a Java program to reverse a given string.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");

        String original = sc.nextLine();
        String rev = "";

        for(int i=original.length()-1; i>=0; i--) {
            rev = rev+original.charAt(i);
        }
        System.out.println("Reversed string is : "+rev);
        sc.close();
    }
}
