import java.util.Scanner;

public class Task42_Find2ndSmallestNum {
    //Find and print the second-smallest number in an array.
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

        for(int i=0; i<n; i++) {

            if(arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i]<secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        if(secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Second smallest element not possible!");
        } else {
            System.out.println("Second smallest element is : "+secondSmallest);
            sc.close();
        }
    }
}
