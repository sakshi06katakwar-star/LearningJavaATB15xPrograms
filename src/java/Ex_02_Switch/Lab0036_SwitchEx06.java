package Ex_02_Switch;

public class Lab0036_SwitchEx06 {
    public static void main(String[] args) {
        //what is the output for this?
        int a = 11;//this is to fool us, nothing to do with prog
        switch (-1) {
            default: System.out.println("default");
            break;

            case -1 :
                System.out.println("10");
                break;
            case 9 :
                System.out.println("9");
                break;
        }
    }
}//output will be 10 because case -1 will match with switch (-1)
