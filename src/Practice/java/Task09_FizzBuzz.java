import java.util.Scanner;
//Print numbers from 1 to n. For multiples of 3, print 'Fizz'. For multiples of 5, print 'Buzz'.
// For multiples of both 3 and 5, print 'FizzBuzz'.
public class Task09_FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");
        int num = sc.nextInt();

        System.out.println(num);

        if(num%3==0 && num%5==0) {
            System.out.println("FizzBuzz");
        } else if (num%3==0) {
            System.out.println("Fizz");
        } else if (num%5==0) {
            System.out.println("Buzz");
        } else if (num%3 !=0 && num%5 !=0) {
            System.out.println("Invalid input!");
        }

        sc.close();
    }
}
