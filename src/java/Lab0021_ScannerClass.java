import java.util.Scanner;

public class Lab0021_ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age...");
        int age = scanner.nextInt();
        System.out.println(age);
        if(age>60){
            System.out.println("You are a Sr.citizen");
        }else {
            System.out.println("You are an adult");
        }
    }
}
