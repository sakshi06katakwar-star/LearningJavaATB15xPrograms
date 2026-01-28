package Ex_22_CollectionAPI;

public class Lab0098_SetHashSetEx01 {
    public static void main(String[] args) {}}
//Duplicates are not allowed and insertion order is also not preserved means objs are arranged in random order.
//Hash code concept is used while inserting elements. No index concept here. Heterogeneous data and null also allowed.
//     Hash Set hs = new Hash Set();
// 16 elements we can store by default. this size can increase later.
//whenever we create an obj in HS so by default 16 locations are already allocated means 16 is the initial size of
//the HS so Hs will create entire new obj and all ele are shifted there and old one is gone to garbage collector.
//Load factor - in HS as soon as the location is reached to 0.75 immedietly it creats a new obj and all ele are
//shifted there and old one is gone to garbage collector.
//     ex. Hash Set hs = new Hash Set(100);
//     Hash Set hs = new Hash Set(100,0.75); 100=initial locations,0.75=load factor

//Methods - It does not have its own methods it has all methods which belongs to set interface.

//add(value)
//addAll(collection)
//remove(value)
//removeAll(collection)
//contains(obj)
//containsAll(obj)
//isEmpty()
//sorting and shuffling is not possible as elements are not arranged in proper index.

