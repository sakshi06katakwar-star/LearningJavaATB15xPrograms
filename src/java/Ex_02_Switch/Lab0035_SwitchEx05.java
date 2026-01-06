package Ex_02_Switch;

public class Lab0035_SwitchEx05 {
    public static void main(String[] args) {
        //is this a valid syntax? if yes what is the output?
        char ch = 'A';
        switch (ch) {
            case 65 :
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No match");
        }
    }
}//it is valid because ch=A and A=65 as per ASCII value and also we have a matching case with it hence no exception
