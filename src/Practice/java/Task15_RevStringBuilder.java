import java.util.Scanner;

public class Task15_RevStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String ori = sc.nextLine();
        StringBuilder sb = new StringBuilder(ori);
        sb.reverse();
        String rev = sb.toString();

        System.out.println("Rev string is : "+rev);
        sc.close();
    }
}
