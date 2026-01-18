package Ex_12_DoWhileLoop;

import java.util.Scanner;

public class Lab0051_DoWhileUsingScannerClassEx02 {
        //Create a function of Sum, Div, Mul and Sub with parameters a and b
        //(take the parameters from user)

        //we have created here readInt func which is funct whome we have to give a Scanner and a message or prompt
        //ex. readInt(scanner, msg/prompt: "Enter the num: ")
      //  int a = readInt(scanner, prompt: "Enter num1: ");
     //   int b = readInt(scanner, prompt: "Enter num2: ");
     //   scanner.close();
        static int sum (int a, int b) {
          return a+b;
        }

        static int sub (int a, int b) {

            return a-b;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        //taking input from user
        System.out.println("Enter num1: ");
        if (scanner.hasNextInt()) {
             num1 = scanner.nextInt();
        } else {
            System.out.println("Invalid input! Please enter a number.");
            return;   // stop program
        }
        System.out.println("Enter num2: ");
        if (scanner.hasNextInt()) {
            num2 = scanner.nextInt();
        } else {
            System.out.println("Invalid input! Please enter a number.");
            return;   // stop program
        }

        //calling func
       int sumResult = Lab0051_DoWhileUsingScannerClassEx02.sum(num1,num2) ;
        System.out.println(sumResult);
        int subResult = Lab0051_DoWhileUsingScannerClassEx02.sub(num1,num2) ;
        System.out.println(subResult);

    }



}

//Why hasNextInt()?
//scanner.hasNextInt() is used to check first whether the user input can be converted to an integer.
//✔ If input is a number → proceed
//❌ If input is a string like "abc" → handle gracefully (no exception)
//So this avoids NumberFormatException
