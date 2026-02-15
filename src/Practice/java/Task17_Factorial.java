import java.util.Scanner;

public class Task17_Factorial {
    //Write a Java program to calculate the factorial of a given number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();

            if(number<0) {
                System.out.println("Factorial of -ve num is not possible!");
            } else {
                long factorial = 1;

                for(int i=1; i<=number; i++) {
                    factorial = factorial*i;
                }
                System.out.println("Factorial of "+number+" is : "+factorial);
            }
            } else {
            System.out.println("Invalid input");
            sc.close();
    }
} }
