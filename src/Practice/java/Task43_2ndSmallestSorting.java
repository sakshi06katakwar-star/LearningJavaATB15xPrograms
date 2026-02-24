import java.util.Arrays;
import java.util.Scanner;
public class Task43_2ndSmallestSorting {
    //Find and print the second-smallest number in an array using sorting method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Second smallest element not possible.");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort array in ascending order
        Arrays.sort(arr);

        int smallest = arr[0];
        int secondSmallest = -1;

        // Traverse from index 1
        for (int i = 1; i < n; i++) {
            if (arr[i] != smallest) {
                secondSmallest = arr[i];
                break;
            }
        }

        if (secondSmallest == -1) {
            System.out.println("No second smallest element found.");
        } else {
            System.out.println("Second smallest element is: " + secondSmallest);
        }

        sc.close();
    }
}

