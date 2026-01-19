package Ex_13_String;

public class Lab0054_StringEx02 {
    public static void main(String[] args) {
        String s1 = "welcome";
        s1 = s1.concat(" again");//here we have 2 strings are present in SCP
        System.out.println(s1);
        s1 = s1.toUpperCase();
        System.out.println(s1);
        System.out.println(s1.length());//13 including space

        String s2 = "welcome"; //here we have only 1 string in SCP which is welcome because s1=s2=wecome.
        //but in case of new always new area is created in Object Area(OA)
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        //In OA always a new string will be created.
        System.out.println(s1 == s3);
        //== is comparision operator which compares the references so hence it is false because s1 is present in
        //SCP and s3 is in OA.
        System.out.println(s1 == s2);//false because welcome again != welcome
        System.out.println(s3==s4);//this is false because everytime a new Hello string is created in OA hence it is
        //changing the references.
        System.out.println(s1.equals(s2));//equals compares the values
        System.out.println(s3.equals(s4));
        String s5 = new String("hello");
        System.out.println(s4.equalsIgnoreCase(s5));

    }//whenever we use new operator string is created in OA.
}
