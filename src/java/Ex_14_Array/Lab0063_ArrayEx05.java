package Ex_14_Array;

import java.util.Arrays;

public class Lab0063_ArrayEx05 {
    public static void main(String[] args) {
        //2nd highest in an array -
        //using function -
       int[] numbers = {5,7,8,9,15,10,11,};
    //    Arrays.sort(num);
     //   System.out.println(num[num.length-2]);
        int max = 0;
        int secondHighest = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > secondHighest) {
                if(numbers[i] != max)
                    secondHighest = numbers[i];
            }
        }

        System.out.println(secondHighest);
    }
}//Step by step  -
//1.  int max = 0;
//Declares an integer variable max
//Initializes it with 0
//Purpose: to store the highest number in the array
//⚠️ Important:
//This assumes all numbers in the array are ≥ 0.

//2.int secondHighest = 0;
//Declares another integer variable
//This will store the second highest number

//3.First for Loop – Find the Maximum
//for (int i = 0; i < numbers.length; i++) {
//Loop runs from index 0 to last index of array
//i is the index of the array

//4.if (numbers[i] > max)
//Compares current element with max

//5.Second for Loop – Find Second Highest
//for (int i = 0; i < numbers.length; i++) {
//Loop again through the array
//Because now we already know the maximum

//6.if (numbers[i] > secondHighest) {
//Checks if current number is greater than current secondHighest

//7.if (numbers[i] != max)
//Ensures we do NOT select the maximum number again
//This avoids duplicates like 20, 20

//8.secondHighest = numbers[i];
//Assigns the value as second highest

//9.System.out.println(secondHighest);
//Prints the second highest value


