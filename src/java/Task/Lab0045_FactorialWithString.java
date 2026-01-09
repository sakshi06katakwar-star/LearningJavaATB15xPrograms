package Task;

import java.util.Scanner;

public class Lab0045_FactorialWithString {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter a positive num");

        int fact = 1;
        if (scanner.hasNextInt()) { //this will check if input is an int then only it will say true else it will say false
            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of entered positive num is => " + fact);
        }
        else {
            System.out.println("Please enter only a positive num ");
        }
        scanner.close();
    }
}


