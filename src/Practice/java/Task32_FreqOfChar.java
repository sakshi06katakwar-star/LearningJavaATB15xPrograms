import java.util.Scanner;

public class Task32_FreqOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string :  ");
        String input = sc.nextLine();
        int n = input.length();

        boolean[] visited = new boolean[n];
        for(int i=0; i<n; i++) {

            if(visited[i])
                continue;

            int count = 1;

            for(int j=i+1; j<n; j++) {
                if(input.charAt(i) == input.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(input.charAt(i)+" occurs "+count+" times : ");
            sc.close();
        }
    }
}
