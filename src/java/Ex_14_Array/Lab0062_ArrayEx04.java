package Ex_14_Array;

public class Lab0062_ArrayEx04 {
    public static void main(String[] args) {
        //sum of array elements -
        int[] num = {1,2,3,4,5};
        int sum = 0;
        for(int i=0; i<num.length; i++) {
            sum = sum+num[i];

        }
        System.out.println(sum);
    }
}
