package Ex_02_Switch;

import java.util.Scanner;

public class Lab0031_SwitchEx01 {
    public static void main(String[] args) {
        //You need to take a user input from 1 to 7, and tell which day is it based on input number.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any num from 1 to 7");
        if(scanner.hasNextInt()) {
        int day = scanner.nextInt();
        switch (day) {
            case 1 :
                System.out.println("Sunday");
                break;
            case 2 :
                System.out.println("Monday");
                break;
            case 3 :
                System.out.println("Tuesday");
                break;
            case 4 :
                System.out.println("Wednesday");
                break;
            case 5 :
                System.out.println("Thursday");
                break;
            case 6 :
                System.out.println("Friday");
                break;
            case 7 :
                System.out.println("Saturday");
                break;
            default :
                System.out.println("Please provide valid input from 1 to 7");

        }

            } else {
            System.out.println("You are giving invalid input! Please check!");
        }
        System.out.println("Program completed");
    }
}
