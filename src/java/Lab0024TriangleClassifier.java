public class Lab0024TriangleClassifier {
    public static void main(String[] args) {
        int a_side = 10;
        int b_side = 10;
        int c_side = 10;

        if(a_side==b_side && b_side==c_side && c_side==a_side){
            System.out.println("the triangle is an equilateral");
        } else {
            System.out.println("the triangle is not an equilateral");
        }
    }

}
