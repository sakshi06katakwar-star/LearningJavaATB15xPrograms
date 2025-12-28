import java.util.Scanner;

public class Lab0029_GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter your score...");
        int score = scanner.nextInt();
        System.out.println(score);
        if(score>=90 && score<=100){
            System.out.println("Your grade is A");
        } else if(score>=80 && score<=89) {
            System.out.println("Your grade is B");
        } else if(score>=70 && score<=79) {
            System.out.println("Your grade is C");
        } else if(score>=60 && score<=69) {
            System.out.println("Your grade is D");
        } else if(score>=0 && score<=59) {
            System.out.println("Your grade is F");
        } else {
            System.out.println("You are out");
            scanner.close();

        }
    }
}
