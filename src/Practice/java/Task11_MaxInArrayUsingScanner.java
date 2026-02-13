import java.util.Scanner;

public class Task11_MaxInArrayUsingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ask user for array size
        System.out.println("Enter size of an array : ");
        int size = sc.nextInt();

        int[] num = new int[size];
        //int[] - I want an array that stores integers
        //num - This is the name of the array variable
        //new int[size] - Create a new array in memory that can store size integers.
        //ex.  int size = 3; then int[] numbers = new int[3];

        // Taking array input from user
        System.out.println("Enter " + size + " integers:");

        for(int i=0; i<size; i++) {
          num[i] = sc.nextInt();
          }
        // Assume first element is maximum
        int max = num[0];

        // Finding maximum element
        for (int i = 1; i < size; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("Maximum element is: " + max);

        sc.close();
        }

    }

