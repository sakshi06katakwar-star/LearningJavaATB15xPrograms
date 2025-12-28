import java.util.Scanner;

public class Lab0026_TriClassi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side...");
        int a_side = scanner.nextInt();
        int b_side = scanner.nextInt();
        int c_side = scanner.nextInt();
        System.out.println(a_side);
        System.out.println(b_side);
        System.out.println(c_side);
        if(a_side==b_side && a_side==c_side){
            System.out.println("Equilateral triangle");
        }
        else if(a_side==b_side && a_side!=c_side){
            System.out.println("Isosceles triangle");
        }
        else if(a_side != b_side && a_side != c_side){
            System.out.println("Scalene triangle");

            scanner.close();
        }

    }
}
