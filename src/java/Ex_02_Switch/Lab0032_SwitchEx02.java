package Ex_02_Switch;

import java.util.Scanner;

public class Lab0032_SwitchEx02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7");
        if(scanner.hasNextInt()) {
            int day = scanner.nextInt();
            switch (day){
                case 1 :
                    System.out.println("Sunday");
                    break;
                case 2 :
                    System.out.println("Monday");
                    break;
            }

        } else {
           System.out.println("Please check your input!");
        }
     //   System.out.println("Program ends");
    }
}//here user is providing input 3 but as there is no matching case with provided input nothing will be in output
// also no exception will be shown because there is no matching case with provided input
