import java.util.Scanner;

public class Task03_HelloWorld {
    public static void main(String[] args) {
     //   System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the message : ");

        String Message = scanner.nextLine();
        System.out.println("Your Message is : " + Message);
    }

    }

