package Ex_14_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Lab0060_ArrayEx02 {
    public static void main(String[] args) {
        //How can we take user input in array?
        //1st we will provide the input -
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = scanner.nextInt();

        int[] marks = new int[size];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks");
            marks[i] = scanner.nextInt();

        }//Now we will print the input using another loop -
        //    for(int i=0; i<marks.length; i++) {
        //      System.out.println(marks[i]);
        //here foreach loop can also be used but only for printing purpose
        for (int mark : marks) {
            System.out.println(mark);

        }//we can also reverse this array using below loop -
        for(int i=marks.length-1; i>=0; i--) {
            System.out.println(marks[i]);
        }
    } }
