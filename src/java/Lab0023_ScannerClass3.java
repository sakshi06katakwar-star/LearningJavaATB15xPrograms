import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab0023_ScannerClass3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name...");
        String name = scanner.next();
        System.out.println(name);
        if(name.equals("Sakshi")){
            System.out.println("Its my name");
        } else if (name.equals("Aayush")) {
            System.out.println("Its my brother's name");
        } else if(name.equals("Samiksha")){
            System.out.println("Its my elder sister's name");
        }else {
            System.out.println("Name matches with none");
        }
        scanner.close();


    }
}
