package Ex_22_CollectionAPI;

import java.util.Iterator;
import java.util.LinkedList;

public class Lab0095_LinkedListEx02 {
    public static void main(String[] args) {
 //       LinkedList ll = new LinkedList(); //Hetrogenous data
 //       LinkedList <Integer> ll1 = new LinkedList <Integer> (); //Homogenous data

        LinkedList ll = new LinkedList();
  //add -
          ll.add(200);
          ll.add('B');
          ll.add(false);
          ll.add("Barclays");
          ll.add(null);
        System.out.println(ll);
   //size -
        System.out.println(ll.size());
   //remove -
        ll.remove(2);
        System.out.println("After removing new array : "+ll);
   //insert - adding elem in the middle
        ll.add(3,"Java");
        System.out.println("after inserting ele new list is : "+ll);
    //retrieve -
        System.out.println(ll.get(3));
   //replace -
        ll.set(4,300);
        System.out.println(ll);
   //contains -
        System.out.println(ll.contains("Java"));
   //isEmpty -
        System.out.println(ll.isEmpty());
    //To read data -
        System.out.println("===forLoop===");
        for(int i=0; i<ll.size(); i++)
        {
            System.out.println(ll.get(i));
        }

        System.out.println("===forEachloop===");
        for(Object e:ll)  //Object we are taking here because LL have different type of data else we would have
                          //given the data type instead of obj.
        {
            System.out.println(e);
        }

        System.out.println("===Iterator===");
        Iterator it = ll.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
