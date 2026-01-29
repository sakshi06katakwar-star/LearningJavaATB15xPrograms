package Ex_22_CollectionAPI;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Lab104_PriorityQueueEx02 {
    public static void main(String[] args) {
        PriorityQueue que = new PriorityQueue();
        que.add('A');
        que.add('B');
        que.add('C');
        que.add('C');
        que.offer('D');
        System.out.println(que);

    //    System.out.println(que.element());//if q is empty this throws NoSuchElementException
    //    System.out.println(que.peek());  //if q is empty this throws null

    //    System.out.println(que.remove());
    //    System.out.println(que);
     //   System.out.println(que.poll());
     //   System.out.println(que);
    //    System.out.println(que.remove());//if q is empty this throws NoSuchElementException
    //    System.out.println(que.poll()); //f q is empty this throws null

    //to read all the elem iterator method and foreach loop is used
        System.out.println("===iterator===");
        Iterator it = que.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("===foreach loop===");

        for(Object e:que)
        {
            System.out.println(e);
        }
    }
}
//In PQ Only Homogeneous(same type) data is allowed so if we try to store Heterogeneous data in PQ it throws
//ClasCastException.
