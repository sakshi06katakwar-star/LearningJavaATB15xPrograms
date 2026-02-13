import java.util.Scanner;

public class Task13_ArraySum {
    //Calculate and print the sum of all elements in an array.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the size of your array?");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter "+ size +" elements");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;

        for(int i=0;i<size; i++) {
            sum = sum+arr[i];
        }
        System.out.println("Sum of all elements : "+ sum);
        sc.close();
    }
}
