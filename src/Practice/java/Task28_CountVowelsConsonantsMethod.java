import java.util.Scanner;

public class Task28_CountVowelsConsonantsMethod {
//Character.isLetter()
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string : ");
    String input = sc.nextLine();

    int vowels = 0;
    int consonants = 0;
    input = input.toLowerCase();

            for(char ch : input.toCharArray()) {
                // Check if it is a letter
                if (Character.isLetter(ch)) {

                    // Check if vowel
                    if (ch == 'a' || ch == 'e' || ch == 'i'
                            || ch == 'o' || ch == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }

    System.out.println("Number of vowels: " + vowels);
    System.out.println("Number of consonants: " + consonants);
}
}


