package Ex_22_CollectionAPI;

import java.util.LinkedHashSet;

public class Lab102_LinkedHashSetEx01 {
    public static void main(String[] args) {

//The basic difference between HS and LHS is insertion order is preserved whereas duplicates are not allowed
//Initial size is 16 and load factor is 0.75 same as HS
        LinkedHashSet link = new LinkedHashSet();
        link.add("Barclays");
        link.add("Sakshi");
        link.add(true);
        link.add(400);
        link.add(45.6);
        System.out.println(link);

 //All mrthods works for HS same is for LHS.


    }
}