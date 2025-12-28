import java.util.Scanner;

public class Lab0027_FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number...");
        int num = scanner.nextInt();
        System.out.println(num);
        if(num%3==0 && num%5==0){
            System.out.println("FizzBuzz");
        } else if(num%3==0) {
            System.out.println("Fizz");
        } else if(num%5==0 ) {
            System.out.println("Buzz");
        } else {
            System.out.println("Arrrr...");
            scanner.close();
        }
    }
}
