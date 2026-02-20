import java.util.Scanner;

public class Task37_RevArrEle2 {
    public static void main(String[] args) {
        //Print the elements of an array in reverse order using scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements in reverse order:");

        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
