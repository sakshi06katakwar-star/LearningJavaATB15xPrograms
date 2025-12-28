import java.util.Scanner;

public class Lab0025_TriClassi_ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side...");
        int a_side = scanner.nextInt();
        int b_side = scanner.nextInt();
        int c_side = scanner.nextInt();
        System.out.println(a_side);
        System.out.println(b_side);
        System.out.println(c_side);
        if(a_side==b_side && b_side==c_side && c_side==a_side){
            System.out.println("the triangle is an equilateral");
        } else {
            System.out.println("the triangle is not an equilateral");
            scanner.close();
        }
    }
}
