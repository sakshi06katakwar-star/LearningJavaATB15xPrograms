package Ex_22_CollectionAPI;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Lab107_HashMapEx01 {
    public static void main(String[] args) {
     //   HashMap hash = new HashMap();
        HashMap<Integer,Character> hash = new HashMap<Integer,Character>();
        hash.put(101,'A');
        hash.put(102,'B');
        hash.put(103,'C');
        hash.put(104,'D');
        hash.put(105,'A');
        System.out.println(hash);//key - unique, value - can be duplicate

        System.out.println(hash.get(101));//passing kay getting value

        hash.remove(105);
        System.out.println(hash);

        System.out.println(hash.containsKey(101));

        System.out.println(hash.containsValue('B'));

        System.out.println(hash.isEmpty());

        System.out.println(hash.keySet());//returns all keys in set format,duplicates not allowed
    //    System.out.println(hash.values());//returns values as a collection

    //    System.out.println(hash.entrySet());//returns all entries as a set obj

    //If I want a particular key or value so I have to go with entry interface methods
    //To read values from entries we use foreach loop but for that explicitly we have to define the type of key-value
    //else loop will take it as obj and print all values
    //    HashMap hash = new HashMap();
        for(Object i: hash.keySet()) //for(Object i: hash.values()) this will print all values altogether
        {
            System.out.println(i);
        }                           //this is printing all keys together

    //to print keys/values 1 by 1 we explicitly define the type of key-value
    /*    HashMap<Integer,String> hash = new HashMap<Integer,String>();

        for(int i:hash.keySet())   int i because keys are of int type
        {
            System.out.println(i);
        }*/

    //to get key-value individually -
        for(Object i: hash.keySet())
        {
            System.out.println(i+"     "+hash.get(i));
        }

  //Entry methods -
    //  HashMap<Integer,Character> hash = new HashMap<Integer,Character>();
        System.out.println("===Entry method===");
        for (Map.Entry entry:hash.entrySet())
        {
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }
        //hash.entrySet() will give key-value pair which will store in entry varialbe which is of Map.Entry type
        //then entry.getKey() will print key and entry.getValue() will print value

        System.out.println("===iterator===");

        Set s = hash.entrySet(); //hash.entrySet() will return all entries in the form of set hence return type is Set
        //s is representing all the entries
        Iterator itr = s.iterator();
        while (itr.hasNext())
        {
            Map.Entry entry= (Map.Entry) itr.next();
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }


    }
}
