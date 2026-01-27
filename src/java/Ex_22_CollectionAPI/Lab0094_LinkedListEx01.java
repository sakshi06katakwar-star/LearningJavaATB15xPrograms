package Ex_22_CollectionAPI;

public class Lab0094_LinkedListEx01 {
    public static void main(String[] args) {}}
 //Linked List is a class which implements methods from List interface as well as Dque interface.
 //we should use ArrayList get method to retrieve objs but if we have to perform insertion/deletion we should
 //not prefer Arraylist because elements will shuffle more
 //For insertion/deletion we use Linked List. in LL every element is called as a node and whenever we want to add
 //a new element in LL a new node is created. l.add(1,'A'), l.delete(1)
 //We should not prefer LL when we have more num of retrievals because if array is large so it will take larger
//time because of so much navigation.
        //Methods in LL -
        //LL methods = List methods + Arraylist methods + Dque methods + some additional methods
//LL is preferred to develop stacks and ques.
//Stack - FILO is stacks concept
//Que - FIFO is que concept
//Every node in LL having previous elem address and next ele address by these addresses nodes are connected
//with each other. By default LL follows Doobly Datastructure.

//add(obj), add(ind,obj), addAll(coll), remove(obj), remove(ind), removeAll(coll), l.get(ind), l.set(ind,obj)
//Collections.sort(), Collections.shuffle()

//LL specific methods -
//addFirst(obj) - new elem will be added at 1st position
//addlast(obj), removeFirst(obj), removeLast(obj), getFirst(obj), getLast(obj)






