package Ex_13_String;

public class Lab0053_StringEx01 {

    //sequence of characters, non-primitive datatypes, it is a final class means it cannot be inherited.
    //it is Immutable(can't change) in nature.it means whenever we create a string it is always present in SCP.
    //SCP- String Constant Pool
    //Here is the list of some commonly used functions -
    public static void main(String[] args) {
        String name = "sakshi";
        boolean result = name.contains("k");
        System.out.println(result);

        name = name.toUpperCase();
        System.out.println(name);


    }



}