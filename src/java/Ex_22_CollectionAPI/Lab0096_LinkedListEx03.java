package Ex_22_CollectionAPI;

import java.util.Collections;
import java.util.LinkedList;

public class Lab0096_LinkedListEx03 {
    public static void main(String[] args) {
        //How to add more objs in LL -
        LinkedList ll = new LinkedList();
        ll.add(1); ll.add(3); ll.add(2); ll.add(4); ll.add(6); ll.add(5);

        LinkedList ll1 = new LinkedList();
        ll1.addAll(ll);
        System.out.println(ll1);

        ll1.removeAll(ll);
        System.out.println(ll1);

        System.out.println("Before sorting : "+ll);
        Collections.sort(ll);
        System.out.println("after sorting : "+ll);

        Collections.sort(ll,Collections.reverseOrder());
        System.out.println(ll);

        Collections.shuffle(ll);
        System.out.println(ll);
    }
}
