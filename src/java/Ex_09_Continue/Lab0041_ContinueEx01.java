package Ex_09_Continue;

import java.util.Scanner;

public class Lab0041_ContinueEx01 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter any no.");
        int num = scanner.nextInt();
        for(int i = 0; i<num; i++) {
            if(i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}//continue only skips true condition(5==5) hence if we give num as 10 only 5 will not be printed rest all num till 9 will
//be printed. also we are printing after if condition.
