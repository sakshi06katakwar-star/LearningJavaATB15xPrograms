package Task;

public class Lab006NestedTurnary_TypeCast {
    public static void main(String[] args) {
        int amol_age = 21;
        String result = (amol_age>18) ? (amol_age>24 ? "Allowed to drink" : "Not allowed to drink") :
                         "Can't travel to Goa";
        System.out.println(result);
    }
}
