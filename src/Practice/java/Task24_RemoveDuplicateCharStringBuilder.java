import java.util.Scanner;

public class Task24_RemoveDuplicateCharStringBuilder {
    //Write a program to remove duplicate characters from a string using String builder.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String input = scanner.nextLine();
        StringBuilder Result = new StringBuilder();
        //result is a StringBuilder that stores characters without duplicates.

        for(int i=0; i<input.length(); i++) {
            char CurrentChar = input.charAt(i);
          //  currentChar is a char.

            // Check if character already exists in result
            if(Result.indexOf(String.valueOf(CurrentChar)) == -1) {
                Result.append(CurrentChar);
            }
        }
        System.out.println("String after removing duplicate characters : "+Result);
        scanner.close();
    }
}
//charAt(i) → Used when looping through string
//charAt(0) → Used only when you want the first character
//Why do we use i in charAt(i)? - Because i represents the current index in the loop, allowing us to access each
//character sequentially.
//indexOf() works with String, not char.
//So we convert char → String.
//Example: char currentChar = 'p'; String.valueOf(currentChar)   // "p" like this we are converting
//CurrentChar into String through String.valueOf(CurrentChar)
//What does result.indexOf(...) do? It checks: “Is this character already inside result?”
//If found → returns its index (0, 1, 2, …)
//If NOT found → returns -1 , -1 means 👉 character NOT found
//
