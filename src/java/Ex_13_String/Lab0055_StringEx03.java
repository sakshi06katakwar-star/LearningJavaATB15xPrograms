package Ex_13_String;

public class Lab0055_StringEx03 {
    public static void main(String[] args) {
        String s = "Barclays" ;
        char c = s.charAt(4);
        System.out.println(c);
        //charAt starts with 0 as it is index based.
        System.out.println(s.length());

        //compare to - It compares the 1st int of both strings.
        int result = "abc".compareTo("Abc");
        System.out.println(result);
        //a=97 and A=65 97-65=32
        int result1 = "Abc".compareTo("Abc");
        System.out.println(result1);

        //index of - gives the index.
        int a = "Barclays".indexOf("y");
        System.out.println(a);

        //lastIndexof - gives index of 2nd same char.
        int a1 = "Barclays".lastIndexOf("a");
        System.out.println(a1);

        //isEmpty - tells whether string is empty or not.
        boolean b = "".isEmpty();
        System.out.println(b);//don't give space, spaces are count here.

        //join - it joins with *
        String c1 = String.join("*","Java","Script");
        System.out.println(c1);

        //replace - replaces char
        String c2 = "Java".replace('a','o');
        System.out.println(c2);

        //startsWith -
        Boolean c3 = "Barclays".startsWith("la");
        System.out.println(c3);


    }
}
