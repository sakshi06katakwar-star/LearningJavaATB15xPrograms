import java.util.LinkedHashSet;
import java.util.Set;

public class Task25_RemoveDuplicateCharHashSet {
    //Write a program to remove duplicate characters from a string using Hash Set.
    public static void main(String[] args) {
        String input = "banana";

        Set<Character> set = new LinkedHashSet<>();

        for(char ch : input.toCharArray()) {
            set.add(ch);
        }
        StringBuilder result  = new StringBuilder();
        for(char ch : set) {
            result.append(ch);
        }
        System.out.println(result);
    }
}
//toCharArray() - Converts the string into a character array
//for (char ch : array) - Take each character from the array one by one and store it in variable ch.
//set.add(ch) - It automatically removes duplicates
