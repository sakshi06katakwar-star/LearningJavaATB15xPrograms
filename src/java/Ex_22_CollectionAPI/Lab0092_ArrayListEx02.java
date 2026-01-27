package Ex_22_CollectionAPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Lab0092_ArrayListEx02 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("A");
        al.add("X");
        al.add("C");
        al.add("B");
        al.add("Y");
        al.add("Z");
//now to add or remove all objs of al we use addAll and removeAll methods -
        //addAll -
        ArrayList al1 = new ArrayList();
        al1.addAll(al);
        System.out.println(al1);
        //removeAll -
        al1.removeAll(al);
        System.out.println(al1);
        //sort - to sort elements we have method from collections class
        System.out.println(al);
        Collections.sort(al);
        System.out.println("after sorting : "+al);
        //to sort the Array list in reverse order -
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("after sorting in reverse order : "+al);
        //to shuffle -
        Collections.shuffle(al);
        System.out.println("after shuffling : "+al);


    }
}
