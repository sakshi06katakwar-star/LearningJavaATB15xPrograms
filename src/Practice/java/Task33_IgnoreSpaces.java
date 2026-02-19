import java.util.Scanner;
public class Task33_IgnoreSpaces {
    //Find and print the frequency of each char element in an array ignore spaces.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // If we want we can Convert to lowercase to ignore case
       // input = input.toLowerCase();
        // Skip if not alphabet

        int n = input.length();
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            char ch = input.charAt(i);

            // Ignore spaces
         //   if (input.charAt(i) == ' ')
         //       continue;
            if (!Character.isLetter(ch))
                continue;

            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(input.charAt(i) + " occurs " + count + " times");
        }

        sc.close();
    }
}

