import java.util.Scanner;

public class Task35_PrintDuplicateChar {
    //Print all duplicate elements in a char array -
    //1. Ignore spaces
    //2. Ignore Upper/Lower cases.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String input = sc.nextLine();
        input = input.toLowerCase();
        int n = input.length();

        boolean[] visited = new boolean[n];
        boolean foundDuplicate = false;

        for(int i=0; i<n; i++) {

            if(input.charAt(i) == ' ')
                continue;

            if(visited[i])
                continue;

            for(int j=i+1; j<n; j++) {
                if(input.charAt(i) == input.charAt(j)) {
                    System.out.println("Duplicate element : "+input.charAt(i));
                    visited[j] = true;
                    foundDuplicate = true;
                    break;
                }
            }
        }
        if(!foundDuplicate) {
            System.out.println("No duplicate element is found!");
            sc.close();
        }
    }
}

