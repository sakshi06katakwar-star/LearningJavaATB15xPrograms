import java.util.Scanner;

public class Task34_PrintDuplicateElements {
    //Print all duplicate elements in an array.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements : ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean[] visited = new boolean[n];
        boolean foundDuplicate = false;

        for(int i=0; i<n; i++) {
            if(visited[i])
                continue;

            for(int j=i+1; j<n; j++) {
                if(arr[i]==arr[j]) {
                    System.out.println("Duplicate element : "+arr[i]);
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
