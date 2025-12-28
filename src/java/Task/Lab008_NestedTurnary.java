package Task;

public class Lab008_NestedTurnary {
    public static void main(String[] args) {
        int age_aayush = 10;
        int age_sakshi = 12;
        int age_samiksha = 15;
        String Oldest = (age_aayush < age_sakshi) ? (age_sakshi > age_samiksha ?
                       "sakshi is the oldest" : "samiksha is the oldest" ) : "sakshi is the oldest";
        System.out.println(Oldest);
    }
}
