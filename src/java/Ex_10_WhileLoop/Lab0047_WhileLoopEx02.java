package Ex_10_WhileLoop;

public class Lab0047_WhileLoopEx02 {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;
        int i = 1;
        while(i <= num) {
            fact = fact*i;
            i++;

        }
        System.out.println(fact);

    }
}
