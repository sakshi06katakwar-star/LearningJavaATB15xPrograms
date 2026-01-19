package Ex_13_String;

public class Lab0056_CharSequence {
    public static void main(String[] args) {
        CharSequence q = "Barclays";
        System.out.println(q.subSequence(2,5));//end-1 hence a is not printed

        String a = "Barclays".substring(3);
        System.out.println(a);//start printing from 3rd index

        //toCharArray - converts into an array.
        char[] arr = "Clays".toCharArray();
        System.out.println(arr);

        //isBlank -
        boolean d = " ".isBlank();
        System.out.println(d);

        //repeat - repeats as many times provided.
        String a3 = "Hmm".repeat(3);
        System.out.println(a3);

        //lines().count() -
        long count = "a\nb\nc".lines().count();
        System.out.println(count);


    }
}
