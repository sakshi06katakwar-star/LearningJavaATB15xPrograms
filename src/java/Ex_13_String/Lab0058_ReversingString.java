package Ex_13_String;

import java.util.Scanner;

public class Lab0058_ReversingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String reverse = "";
        for(int i = input.length()-1; i>=0; i--) {
            reverse = reverse + input.charAt(i) ;
        }
        System.out.println(reverse);

    }
}
