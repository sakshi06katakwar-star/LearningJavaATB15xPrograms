package EX_03_Break;

public class Lab0039_BreakEx02 {
    public static void main(String[] args) {
        for(int i=0; i<50; i++) {
            System.out.println(i);
            if(i == 5) {
                break;
            }
        }
        System.out.println("End of program");
    }
}//here we are printing before if condition hence o/p is 0 1 2 3 4 5
//Reason
//
//The print statement executes first
//
//Then the if (i == 5) is checked
//
//So 5 gets printed before break stops the loop
