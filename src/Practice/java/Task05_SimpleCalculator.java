import java.util.Scanner;

public class Task05_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int num1 = scanner.nextInt();

        System.out.println("Enter 2nd number : ");
            int num2 = scanner.nextInt();

        System.out.println("Enter operator(+,-,*,/) : ");
            char operator = scanner.next().charAt(0);

            int result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;

                    } else {
                        System.out.println("Cannot divide by 0");
                        return;
                    }
                    break;

                default:
                    System.out.println("Invalid operator!");
                    return;
            }

            System.out.println("Result is : " + result);

            scanner.close();
        }
    }


