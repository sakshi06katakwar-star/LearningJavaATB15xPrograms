public class Task36_ReverseArrayElements1 {
    //Print the elements of an array in reverse order using normal for loop.
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Array elements in reverse order:");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

