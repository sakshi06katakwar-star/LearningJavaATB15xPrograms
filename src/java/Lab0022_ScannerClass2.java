import java.util.Scanner;

public class Lab0022_ScannerClass2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quantity...");
        int quantity = scanner.nextInt();
        System.out.println(quantity);
        if(quantity>=12) {
            System.out.println("It is = 1 dozen");
        }else {
            System.out.println("It is not");
        }

    }
}
