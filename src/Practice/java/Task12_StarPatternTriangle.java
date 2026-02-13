import java.util.Scanner;

public class Task12_StarPatternTriangle {
    //Print a right triangle pattern using stars. For input n, print n rows where row i has i stars.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of rows : ");
        int row = sc.nextInt();

        for(int i=1; i<=row; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
            sc.close();
        }

    }
}
