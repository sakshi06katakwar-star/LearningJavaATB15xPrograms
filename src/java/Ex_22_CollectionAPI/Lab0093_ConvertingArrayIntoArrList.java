package Ex_22_CollectionAPI;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab0093_ConvertingArrayIntoArrList {
    public static void main(String[] args) {
        String arr[] = {"Apple","Pear","Banana","Papaya","Grapes"};
        for(String values: arr) {
            System.out.println(values);
        }

        ArrayList al = new ArrayList(Arrays.asList(arr));
        System.out.println(al);
    }
}
//this concept is used when we print elements of an array in arrlist and also preserve the sequence.