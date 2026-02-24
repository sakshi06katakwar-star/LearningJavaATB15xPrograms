import java.util.Scanner;
public class Task44_2ndSmallestForEachloop {
    //Find and print the second-largest number in an array using for each loop
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

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // for-each loop
        for (int num : arr) {

            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            }
            else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element found.");
        } else {
            System.out.println("Second smallest element is: " + secondSmallest);
        }

        sc.close();
    }
}
