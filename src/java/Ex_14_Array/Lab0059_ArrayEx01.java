package Ex_14_Array;

import java.util.Arrays;

public class Lab0059_ArrayEx01 {
    public static void main(String[] args) {
        //How can we iterate over array?
        int[] marks = {58,69,78,89,75,94};
     //   System.out.println(marks.length);
      //  System.out.println(marks[0]);
      //  System.out.println(marks[1]);//likewise but it is a unprofessional way

        for(int mark: marks) {
            System.out.println(mark);
        }
        System.out.println("==============");
        for(int i=0; i<=5; i++) {
            System.out.println(marks[i]);
        }
    }
}
//String default value is null.