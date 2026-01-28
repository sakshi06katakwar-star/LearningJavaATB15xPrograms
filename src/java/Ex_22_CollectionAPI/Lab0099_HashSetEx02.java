package Ex_22_CollectionAPI;

import java.util.HashSet;
import java.util.Iterator;

public class Lab0099_HashSetEx02 {
    public static void main(String[] args) {
       HashSet hs = new HashSet(); //default capacity is 16 and load factor is 0.75
    //      HashSet hs = new HashSet(100,(float)0.90);
    //     HashSet<Integer> hs1 = new HashSet<Integer>();

        hs.add(100);
        hs.add(null);
        hs.add(true);
        hs.add("Barclays");
        hs.add("Java");
        hs.add(300);
        System.out.println(hs);

        hs.remove(null);
        System.out.println("after remove :"+hs);

        System.out.println(hs.contains("Java"));

        System.out.println(hs.isEmpty());

    //To read the objs from HS
        System.out.println("===forEach Loop===");
        for(Object e:hs)
        {
            System.out.println(e);
        }
        System.out.println("===iterator===");
        Iterator it = hs.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
