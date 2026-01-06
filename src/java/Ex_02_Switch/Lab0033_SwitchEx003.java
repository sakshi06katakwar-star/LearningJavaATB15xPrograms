package Ex_02_Switch;

import java.util.Locale;
import java.util.Scanner;

public class Lab0033_SwitchEx003 {
    public static void main(String[] args) {
        //I will ask the user to provide the input based on browser he wants to use
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter browser");
        String browser = scanner.next();
        browser = browser.toLowerCase(); //if user will provide uppercase input this line will convert line num 11
        // into uppercase hence no exception
        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("......");
                System.out.println("TC001");
                System.out.println("TC002");
                break;
            case "firefox":
                System.out.println("Starting the firefox");
                System.out.println("......");
                System.out.println("TC001");
                System.out.println("TC002");
                break;
            case "edge":
                System.out.println("Starting the edge");
                System.out.println("......");
                System.out.println("TC001");
                System.out.println("TC002");
                break;
            default:
                System.out.println("I have no idea which browser is this! Please check your input!");
                break;



        }
    }
}
