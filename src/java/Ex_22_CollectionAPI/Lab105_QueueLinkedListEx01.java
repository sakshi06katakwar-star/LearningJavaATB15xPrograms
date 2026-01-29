package Ex_22_CollectionAPI;

import java.util.LinkedList;

public class Lab105_QueueLinkedListEx01 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Barclays");
        list.add("Java");
        list.add(false);
        list.add(600);
        list.add(90.34);
        list.add(false);
        System.out.println(list);

        //rest of methods element(),peek(),remove() and poll() works same as PQ.
    }
}
