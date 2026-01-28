package Ex_22_CollectionAPI;

import java.util.HashSet;

public class Lab101_HashsetEx04 {
    public static void main(String[] args) {
        //Union, Intersection, Difference
        HashSet <Integer> set1  = new HashSet <Integer> ();
        set1.add(11);
        set1.add(12);
        set1.add(13);
        set1.add(14);
        set1.add(15);
        set1.add(16);
        System.out.println(set1);

        HashSet <Integer> set2  = new HashSet <Integer> ();
        set2.add(14);
        set2.add(15);
        set2.add(16);
        set2.add(17);
        System.out.println(set2);

//Union -
    //    set1.addAll(set2); //all set2 methods will be added in set1 after removing duplicates.
    //    System.out.println("Union :"+set1);

//Intersection - gives common elements
    //    set1.retainAll(set2);
    //    System.out.println("Intersection :"+set1);

//Difference -
     //   set1.removeAll(set2); //remove all set2 elements
     //   System.out.println("difference :"+set1);

//subset -
        System.out.println("subset :"+set1);
        System.out.println(set2);
//it will print all the ele of set1 + ele of set2 which are present in set1 that's why its skipping 17 because
//17 is not present in set1.

//ContainsAll -
        System.out.println(set1.containsAll(set2));
//its verifying whether set2 is subset of set1 means set2 elem are present in set1 or not.
    }
}
