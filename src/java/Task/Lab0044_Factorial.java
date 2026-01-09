package Task;

import java.util.Scanner;

public class Lab0044_Factorial {
    public static void main(String[] args) {
        System.out.println("Welcome to the Factorial Program");
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter a positive num");
        int n = scanner.nextInt();
        System.out.println(n);
        int fact = 1;

        for(int i=1; i<=n; i++) {
            fact = fact*i;
        }
        System.out.println("Factorial of entered positive num is => "+fact);
        scanner.close();
    }
}// fact   i   fact*i   now fact
//  1      1     1        1
//  1      2     2        2
//  2      3     6        6
//  6      4     24       24
//  24     5     120      120...hence it works

