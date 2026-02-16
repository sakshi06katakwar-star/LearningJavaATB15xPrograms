import java.util.Scanner;

public class Task20_BinarySearchScanner {
    public static int BinarySearch(int[] arr, int key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;     // Element found
            } else if (arr[mid] < key) {
                low = mid + 1;  // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }
        return -1;  // Element not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of your array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " sorted elements : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int result = BinarySearch(arr, key);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
            sc.close();
    }
}
