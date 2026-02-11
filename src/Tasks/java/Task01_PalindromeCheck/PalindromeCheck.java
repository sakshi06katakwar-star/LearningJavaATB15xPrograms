package Task01_PalindromeCheck;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        //A string is called palindrome if it reads same forward and backward.
        //Example: madam, level, 121
        Scanner scanner = new Scanner(System.in); //System.in → taking input from keyboard
        System.out.println("Enter a string");

        String Original = scanner.nextLine();
        String reversed = "";

        // Reversing the string using loop
        for(int i = Original.length()-1; i>=0; i--) {
            reversed = reversed + Original.charAt(i);
        }
        // Checking palindrome
     //   if (Original.equals(reversed)) {  //If we want to ignore uppercase/lowercase (Madam = palindrome):
     //       Replace this line with this:
       if (Original.equalsIgnoreCase(reversed))    {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is NOT a Palindrome");
        }

        scanner.close();

    }
}
//nextLine() -
//nextLine() is a method of Scanner class.
//👉 It reads the entire line of text entered by the user
//👉 It waits until the user presses Enter
//Example:
//If user types:
//Hello World
//nextLine() will store "Hello World" (including space)

//String original -
//This part means:
//Create a variable named original
//Store the input value inside it
//Data type is String
//So basically:
//👉 User types something
//👉 nextLine() reads it
//👉 It gets stored inside original

//Important Difference
//Method	What it Reads
//next()	Reads only one word (stops at space)
//nextLine()	Reads full line including spaces
//Example:
//Input: Sakshi Katakwar
//next() → "Sakshi"
//nextLine() → "Sakshi Katakwar"

//String reversed = "";
//👉 Create a String variable named reversed
//👉 Initialize it with empty value
//We start with empty string Then we keep adding characters one by one.

//length of "madam" = 5 -> Original.length() = 5 but Original.length()-1 = 4 and i=4
//0  1  2  3  4
//m  a  d  a  m
//that's why loop starts from last character m
//so Original.charAt(i) means Original.charAt(4) = m and so on hence
//reversed = "" + "m"
//reversed = "m"

//i = 3
//original.charAt(3) = 'a'
//reversed = "m" + "a"
//reversed = "ma"

//i = 2
//original.charAt(2) = 'd'
//reversed = "ma" + "d"
//reversed = "mad"

//i = 1
//original.charAt(1) = 'a'
//reversed = "mad" + "a"
//reversed = "mada"

//i = 0
//original.charAt(0) = 'm'
//reversed = "mada" + "m"
//reversed = "madam"