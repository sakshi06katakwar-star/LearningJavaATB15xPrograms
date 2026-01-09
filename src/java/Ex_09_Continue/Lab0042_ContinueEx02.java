package Ex_09_Continue;

import java.util.Scanner;

public class Lab0042_ContinueEx02 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter any no.");
        int num = scanner.nextInt();
        for(int i = 0; i<num; i++) {
            System.out.println(i);
            if(i == 5) {
                continue;
            }

        }
    }
}//Here even if cond is satisfied (5==5) execution is continued till 9 because we are printing before if condition


