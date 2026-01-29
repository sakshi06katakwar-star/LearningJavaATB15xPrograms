package Ex_22_CollectionAPI;

public class Lab106_MapInterface {
}
//If I want to store data in the form of key-value pair then Map is preferred.
//ex.101-David, 102-Rock, 103-Smith, 101-Peter etc. but here 101-Peter will replace 101-David
//Each key is an obj and every value is also an obj.
//Duplicate keys are not allowed but duplicate values are allowed.
//Every key-value is called an entry or pair so map is a combination of entries.

//Classes -
//1.HashMap - Underlying data stru is HashTable.
//            Insertion order is not preserved.
//            Duplicate keys are not allowed but duplicate values are allowed.
//            Null key allowed but only once.
//            Multiple null values are allowed.
//            HM is preferred when more num of search operations are there.

//Methods -
//HashMap m = new HashMap();
//m.put(key,value) - to add new pair
//m.putAll(map m1) - to add multiple pairs
//m.get(key) - to get value of key
//m.remove(key) - to remove value along with key i.e, entire record
//m.containsKey(key) - true/false
//m.containsValue(value) - true/false checks particular value is present or not
//m.isEmpty() -
//m.size() - num of entries
//m.clear() - clear all entries

//methods related to entries -
//m.keyset() - returns all the keys as a set because duplicate keys are not there
//m.values() - return all the values as a collection because duplicates are available
//m.entrySet() - returns all entries

//Every entry is represented by Entry interface and this also having some methods which are applicable only on
//entries i.e, key-value pair so entry is sub interface of HM.

//Methods related to entry interface -
//m.getKey(key) - here we get the value of key
//m.getValue() -  here we get the key of value
//m.setValue(obj) - to change/update value of key






