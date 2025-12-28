package Task;

public class Lab007_NestedTurnary {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;
        int maxOfThree = (n1>n2) ? (n2>n3 ? n2 : n3) : n2 ;
        System.out.println(maxOfThree);
    }
}
