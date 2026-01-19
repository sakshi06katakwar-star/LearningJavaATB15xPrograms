package Ex_13_String;

public class Lab0057_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Bar");
        //append - joins

        stringBuffer.append("clays");
        System.out.println(stringBuffer);
        //string buffers are mutable means they replace strings hence only 1 string will be present in SCP.

       //reverse -
        stringBuffer.reverse();
        System.out.println(stringBuffer);

        //replace -

    }
}
