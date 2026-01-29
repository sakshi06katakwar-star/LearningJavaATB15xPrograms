package Ex_22_CollectionAPI;

public class Lab103_QueueInterfaceEx01 {
    //There are 3 chain interfaces of Q -
    //1.Deque I  2.Blocking que I  3.Blocking deque I

    //There are 2 classes implemented by q -
    //1.Priority q C  2.Linked list C

    //If we want to represent a group of elem which are prior to processing then we use q.
    //ex. In WhatsApp msgs are sent 1 after another not in 1 shot this is called prior to processing concept.

    //Q internally follow the FIFO concept.
    //FIFO - elements entering from left is called Head and reverse side is called Tail.
    //  Head <-  <-  <-  Tail
    //       1   2   3
    //here ele are entered from tail that's why they follow 1st in 1st out concept.

    //      Linked list                                             Priority queue
    //                          Insertion order is preserved
    //                          Duplicate objs are allowed
    //Heterogeneous(diff type of data) data is allowed             Only Homogeneous data is allowed

    //Methods -
    //add() - if adding elem is successful this will return true else will through an exception.
    //offer() - if adding elem is successful this will return true else will return false.
    //this is the basic difference b/w add and offer methods.

    //both these methods return the head elem, head elem means the elem which is ready to process.
    //element() - if Q is empty it will through an exception.
    //peek() - if Q is empty it will through null.
    //this is the basic difference b/w element and peek methods.

    //Both these methods return the head elem and remove the elem from the q
    //remove() - if Q is empty it will through an exception.
    //poll() - if Q is empty it will through null.
    //this is the basic difference b/w remove and poll methods.

    //All these 6 methods we can excess through LL and PQ.





}
