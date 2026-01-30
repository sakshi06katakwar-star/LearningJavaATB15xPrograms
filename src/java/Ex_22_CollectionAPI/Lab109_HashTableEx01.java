package Ex_22_CollectionAPI;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Lab109_HashTableEx01 {
    public static void main(String[] args) {
        //Methods -
     //   Hashtable t = new Hashtable();
        //default capacity is 11 which can be further increased and Load factor is 0.75
    //    Hashtable t = new Hashtable(new capacity,fill ratio/Load factor);
    Hashtable<Integer,String> t = new Hashtable<Integer,String>();
        t.put(101,"Rohan");
        t.put(102,"Rahul");
        t.put(103,"Ruhi");
        t.put(104,"Shobha");
    //  t.put(105,"Rohan");//nullPointerException
     //   t.put(106,null);   nullPointerException
        System.out.println(t);

        System.out.println(t.get(103));

        t.remove(101);
        System.out.println(t);//complete pair is removed not only key or value

        System.out.println(t.contains(101));
        System.out.println(t.contains("Rohan"));

        System.out.println(t.isEmpty());

        System.out.println(t.keySet());
        System.out.println(t.values());

        //to get individual key/value loop is used
        System.out.println("===foreach loop===");

        for(int k:t.keySet())//keyset will return all the keys from HT & storing keys in int k
        {
            System.out.println(k+"   "+t.get(k));
        }

        //entry specific methods

        System.out.println("===Entry specific method===");

        for(Map.Entry entry:t.entrySet())  //entrySet will return all entries and store in var & var entry is
                                         //Map.Entry type
        {
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }

        //iterator
        System.out.println("===iterator===");

        Set s = t.entrySet();
        Iterator itr = s.iterator();
        while(itr.hasNext())
        {
           Map.Entry entry = (Map.Entry) itr.next();
           System.out.println(entry.getKey()+"   "+entry.getValue());
        }
    }
}
