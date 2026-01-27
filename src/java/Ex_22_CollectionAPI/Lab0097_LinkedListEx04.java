package Ex_22_CollectionAPI;

import java.util.LinkedList;

public class Lab0097_LinkedListEx04 {
    public static void main(String[] args) {
        //Some additional methods in Linked List -
        LinkedList ll = new LinkedList();
        ll.add("We");
        ll.add("are");
        ll.add("Learning");
        ll.add("Coding");
        ll.add("in Java");

        System.out.println(ll);
        ll.addFirst("To get job");
        System.out.println(ll);

        ll.addLast("To get job");
        System.out.println(ll);

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

    }
}
