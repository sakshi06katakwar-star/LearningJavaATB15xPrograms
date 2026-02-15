import java.util.Scanner;

public class Task18_RecursiveFact {
    //Write a Java program to calculate the factorial of a given number using recursion.
    public static int factorial(int n) {
        if (n==0 || n==1) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number");
        if(sc.hasNextInt()) {
            int num = sc.nextInt();

            if(num<0) {
                System.out.println("Factorial of -ve num is not possible");
            } else {
                int result = factorial(num);
                System.out.println("Factorial of "+num+" is :"+result);
            }
        } else {
            System.out.println("Invalid input!");
            sc.close();
        }
    }
}
