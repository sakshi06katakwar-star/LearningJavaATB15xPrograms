import java.util.Scanner;

public class Task39_2ndLargestScanner {
    //Find and print the second-largest number in an array using scanner class
    //What we will do - Take array size from user
    //Take array elements from user
    //Find second-largest number
    //Handle edge case (less than 2 elements)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = scanner.nextInt();

        if(n<2) {
            System.out.println("Second largest element not possible!");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements : ");

        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        int largest = arr[0];
        int secondLargest = arr[0];

        for(int i=1; i<n; i++) {

            if(arr[i]>largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        if(largest == secondLargest) {
            System.out.println("No second largest element found!");
        } else {
            System.out.println("2nd largest element is : "+secondLargest);
            scanner.close();
        }

    }
}
