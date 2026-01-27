package Ex_22_CollectionAPI;

public class Lab0090_CollectionAPI {}
//Collection - It is an entity which represent multiple objects.
//collection Framework - It is a group of classes or interfaces by which we can reprsent group of objects in a single entity.
//This is the difference between collection and coll frmwork.
//for ex. if we have to write 100 variables then its a long work like int a =1; int b=2;int c=3; and so on so to
//reduce this hectic work we have introduced array int a[] = new int [100];  but here also we have some limitations.
//In array we can store homogenous data only means same type of data and it is overcome using Object Array.
//ex. obj a[] = new obj[5]; it can store homogenous as well as heterogeneous data both.
//It also have some drawbacks like array is fixed in size means arrays are not growable in nature during run time we cannot
//increase or decrease size of an array.
//To overcome this proble we have collection framework
//In coll frmwk there are so many classes and interfaces are available. collection is growable in nature.
//Collection is the base interface in coll frmwk.
//What kind of operations we perform in collection? collection is a group of objects so sometimes we add new obj,
//remove obj also we verify whether particular obj is present in collection or not and all these operations we do
//using certain methods. These methods are present inside coll interface and these methods are common across all
// collection classes.
//Collects is a predefined class in java derived from java.utils package it also contains certain methods and these methods
//we can use to perform operations on collection obj.
//There are main 3 child interfaces of collection interface and these are - 1.List 2.Que and 3.Set
//All these interfaces are implemented using different classes.

//1. List - whatever methods which are available in Collection interface same are available in List including
// methods of List also.
//when we use list? - 1.when we want to preserve the insertion order of objects in collection means we want the
//collection to maintain the order of obj in which order we are inserting them. 2.creating duplicates of objects
//What are the classes available in List? - 1. Array list 2.Linked list 3.Vector which is extended from Stack so
//List interface is implemented using all these 3 classes.

//2. Set - 1. insertion not preserved 2. duplicates are not allowed in these 2 cases we use set.
//classes available - set interface is implemented using 1.Hash set 2.Linked hash set

//3. Que - Que is used whenever we have obj which are prior to processing because it follows FIFO concept.
//ex. if we have 100 recipients in cc and we are sending mail to all of them so it will follow fifo concept like
//this que works.
//classes available - que interface is implemented using priority que.

//Map - this is an independent interface. this also represent group of obj but these obj are in key-value pair.
//Keys cannot be duplicated but values can be duplicated. Keys are unique. ex. 101 Devid, 102- Victor etc.
//classes available - Map interface is implemented using 1.Hash map 2. Linked hash map 3.Hash table

//What are the methods are available in Collection interface?
//1. to add single obj in collection - add(name of obj) it adds obj in the end of the list
//2. to add all objects - addAll(name of collection)
//3. to remove obj - remove(obj name)
//4. to remove all obj - removeAll(collection name)
//5. to accept some obj and remove remaining - retainAll(collection name)
//6. to clear all obj - clear()
//7. to check collection is empty or not - isEmpty()
//8. to check how many obj are in collection - size()
//9. to check a particular obj is present in collection or not - contain()
//10.to check all the objects are present in collection or not - containsAll(collection name)
//11.to convert entire collection into array format - toArray(collection name) this will return an obj array

//What are other methods which are available in List interface?
//To uniquely identify the elements in list we use indexation.
//1. add(index,obj) - it adds obj at the specified index.
//2. addAll(index,collection name)
//3. remove(index)
//4. get(index) - get an obj based on specified index
//5. set(index, new obj) - to replace an exiting obj with the new obj on specified index.

//Array List - used to preserve insertion order and duplicate obj are allowed.
//we declare arr list as ArrayList arrl = new Arraylist();
//It can also store heterogeneous data but if we want to restrict it to store only one type of data then we will
//declare it as - ArrayList <String> arrl = new <string> ();

//Methods which are available in ArrayList -
//1. add(obj) - adds obj in the end
//2. add(index,value/obj)
//3. size() - how many obj/elements in array
//4. remove(index,value)
//5. get(index) - retrieve obj
//6. set(index,obj) - to replace an exiting obj with the new obj on specified index.
//7. contains(obj) - returns boolean value, checks whether a particular obj is present or not
//8. isEmpty() - returns boolean value, if empty returns true otherwise false
//9. addAll() - used to add group of obj
//10. removeAll()
//11. to sort the elements we have to use collections class obj - collections.sort(here pass array list element)
//12. to shuffle all elements - collections.suffle(array list element)
//13. to convert array into array list -



