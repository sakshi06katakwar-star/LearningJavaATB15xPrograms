import java.util.Scanner;

public class Task31_ArrayElementsFrequencyNestedLoop {
    //Find and print the frequency of each element in an array.
    //Method 1 - Using Nested Loop
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements : ");
        for(int i=0; i<n; i++) {
            arr[i]= sc.nextInt();
        }
          boolean[] visited = new boolean[n];
        //The visited array helps us:
        //👉 Remember which elements are already counted
        //👉 Skip them in future iterations
        for(int i=0; i<n; i++) { //The outer loop selects one element:arr[i]

            if(visited[i]==true)
                continue;
            //If this element is already counted, skip it and move to the next iteration.
            //visited[i]- This checks whether the element at index i has already been processed.
            //true → Already counted
            //false → Not counted yet

            int count = 1;

            for(int j=i+1; j<n; j++) { //The inner loop compares it with the remaining elements:arr[j]
                if(arr[i]==arr[j]) {
            //We are checking: “Is the current element equal to the next element?”
                    //If yes → it means we found a duplicate.
                    count++;
                    visited[j] = true;
                    //Mark that duplicate element as already counted.
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times");
            sc.close();
        }
    }
}
