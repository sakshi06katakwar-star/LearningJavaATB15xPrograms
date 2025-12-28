public class Lab0019_IfElse_UserInput {
    public static void main(String[] args) {
        System.out.println("Enter the age via CLI");
        int age = Integer.parseInt(args[0]);

        if(age > 18) {
            System.out.println("You can vote!");
        }else{
            System.out.println("You can't");
        }
    }
}
