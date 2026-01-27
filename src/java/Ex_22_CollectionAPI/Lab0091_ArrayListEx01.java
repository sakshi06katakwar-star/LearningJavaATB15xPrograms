package Ex_22_CollectionAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab0091_ArrayListEx01 {
    public static void main(String[] args) {
        //Declaring an Arraylist for homogenous data -
    //    ArrayList al = new ArrayList();
        //Declaring an Arraylist for heterogeneous data -
    //    ArrayList <String> al1 = new ArrayList <String> ();
        //also we can write it with List because List is super class for Array List
    //    List al2 = new ArrayList();

        ArrayList al = new ArrayList();
    //adding objs -
        al.add(100);
        al.add(true);
        al.add("Barclays");
        al.add('A');
        al.add(89.6);
        System.out.println(al); //this will print all the elements
    //size -
        System.out.println("size of array is : " +al.size());
    //remove -
        al.remove(3);
     //   al.remove('A');
        System.out.println("size of array after removing element : " +al);
    //insert a new element -
        al.add(3,500); //index,value
        System.out.println("size of array after insertion : " +al);
    //retrieve a specific value -
        System.out.println("retrieved element is : " +al.get(2));
    //replace element -
        al.set(4,"Java");
        System.out.println("array after replacement is : " +al);
    //to search an obj in array -
        System.out.println(al.contains("Barclays"));
    //arrary is empty or not -
        System.out.println(al.isEmpty());

    //reading the elements from array all approaches -
       // 1.for loop 2.foreach loop 3. iterator
        System.out.println("===for loop===");
        for(int i=0; i<al.size(); i++) {
            System.out.println(al.get(i));
        }

        System.out.println("===foreach loop===");
        for(Object e: al) {
            System.out.println(e);
        }

        System.out.println("===iterators===");
        Iterator it = al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }








    }
}
