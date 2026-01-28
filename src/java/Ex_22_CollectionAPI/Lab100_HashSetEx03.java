package Ex_22_CollectionAPI;

import java.util.HashSet;

public class Lab100_HashSetEx03 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(2);
        hs.add(4);
        hs.add(6);
        hs.add(8);
        System.out.println(hs);
//addAll()
        HashSet<Integer> hs1 = new HashSet<Integer>();
        hs1.addAll(hs);
        hs1.add(10);
        System.out.println("new hash set :"+hs1);
//removeAll()
        hs1.removeAll(hs);
        System.out.println(hs1);



    }
}
