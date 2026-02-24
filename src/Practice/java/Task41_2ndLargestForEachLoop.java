import java.util.Iterator;
import java.util.Scanner;

public class Task41_2ndLargestForEachLoop {
    //Find and print the second-largest number in an array using for each loop
    //We cannot use index (i) in a for-each loop so we directly compare values.
    //We maintain: largest and secondLargest
    //And loop like this: for (int num : arr)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        if(n<2) {
            System.out.println("2nd largest number is not possible!");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements : ");

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // for-each loop
        for(int num : arr) {

            if(num > largest) {
                secondLargest = largest;
                largest = num;

            } else if (num>secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        if(secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found");
        } else {
            System.out.println("Second largest element is : "+secondLargest);
            sc.close();
        }
    }
}
