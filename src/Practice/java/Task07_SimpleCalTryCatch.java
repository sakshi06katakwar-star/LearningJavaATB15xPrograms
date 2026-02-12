import java.util.Scanner;

public class Task07_SimpleCalTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        char operator;

        try {
            System.out.println("Enter 1st num : ");
            num1 = scanner.nextInt();

            System.out.println("Enter 2nd num : ");
            num2 = scanner.nextInt();

            System.out.println("Enter operator(+,-,*,/) : ");
            operator = scanner.next().charAt(0);
        }
           catch (Exception e) {
               System.out.println("Invalid input!");
               return;
           }

        int result;

        if (operator == '+') {
            result = num1+num2;
            System.out.println("Result : "+result);
        }
          else if (operator == '-') {
              result = num1-num2;
            System.out.println("Result : "+result);
        }
          else if(operator == '*') {
              result = num1*num2;
            System.out.println("Result : "+result);
        }
          else if (operator == '/') {
              if(num2 != 0) {
                  result = num1/num2;
              }else {
                  System.out.println("Number cannot divide by 0");
              }

        } else{
            System.out.println("Invalid input!");
            scanner.close();
        }
    }
}
