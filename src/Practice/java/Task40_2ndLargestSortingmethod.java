import java.util.Arrays;
import java.util.Scanner;

public class Task40_2ndLargestSortingmethod {
    //Find and print the second-largest number in an array using sorting method
    //Logic Using Sorting  -  Take input using Scanner
    //Sort the array
    //Largest element will be at last index → arr[n-1]
    //Traverse backward to find first element smaller than largest → that is second largest
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("2nd largest element is not possible! ");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements : ");

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        // Sort the array
        Arrays.sort(arr); //this will sort the array in ascending order (smallest → biggest)

        int largest = arr[n-1];
        int secondLargest = -1;

        for(int i=n-2; i>=0; i--) {

            if(arr[i] != largest) { //Skip all values that are equal to the largest
                secondLargest = arr[i];
                break;
            }
        }
        if(secondLargest == -1) {
            System.out.println("No 2nd largest element is found!");
        } else {
            System.out.println("2nd largest element is : "+secondLargest);
            sc.close();
        }
    }
}
//If n = 5
//First index = 0
//Last index = n - 1 Which is = n - 1 = 5 - 1 = 4 so Last index = 4
