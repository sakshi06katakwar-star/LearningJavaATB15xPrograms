public class Task21_TwoSum {
    //Given an array of integers and a target sum, return the indices of two numbers that add up to the target.
    //Brute Force
    public static int[] twoSum(int[]nums,int target) {
        for(int i=0; i<nums.length; i++){  //Outer loop (i) picks the first element and
                                          // Inner loop (j) checks all elements after i
            for(int j=i+1; j<nums.length; j++) {

                if(nums[i]+nums[j]==target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] Result = twoSum(nums,target);
        System.out.println("Indices : "+Result[0]+","+Result[1]);

    }
}
