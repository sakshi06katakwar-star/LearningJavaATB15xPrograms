import java.util.Scanner;

public class Task26_CountVowelsConsonants {
    //Write a program to count the number of vowels and consonants in a given string.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String input = sc.nextLine();

        int vowels = 0;
        int consonants = 0;
        input = input.toLowerCase(); //So we don’t need to check both uppercase and lowercase separately.

        for(int i=0; i<input.length(); i++) {
            char ch = input.charAt(i);

            // Check if character is a letter
            if(ch>='a' && ch<='z') { //This avoids counting spaces, numbers, special characters.
                // Check vowel
                if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        sc.close();
    }
}
