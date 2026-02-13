public class Task10_FindMaximumInArray {
    public static void main(String[] args) {
        //Find and print the maximum element in an array of integers.

        int[] num = {34,48,65,28,75,52};
        // Assume first element is maximum
        int max = num[0];  //34
        // Loop through array
        for(int i =1; i<num.length; i++) {  //Loop starts from index 1 i=1 not 0 because we have assumed first
                                           // element is maximum
            if(num[i] > max ) {   //if 48>34
               max = num[i];       // max = 48
            }
        }
        System.out.println("Max num is : "+max);
    }
}
