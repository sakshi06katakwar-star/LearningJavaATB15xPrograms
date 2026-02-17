import java.util.Scanner;

public class Task22_TwoSumScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take size of array
        System.out.println("Enter size of your array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        //Step 2: Take array elements
        System.out.println("Enter "+n+" elements");
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        //Step 3: Take target
        System.out.println("Enter target value");
        int target = sc.nextInt();

        // Step 4: Brute Force Logic
        boolean found = false;
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {

                if(nums[i]+nums[j]==target) {
                    System.out.println("Indices : "+i+" and "+j);
                    found = true;
                    break;
                }
            }
            if(found)
                break;
        }
        if (!found) {
            System.out.println("No two nums found!");
            sc.close();
        }

    }
}
