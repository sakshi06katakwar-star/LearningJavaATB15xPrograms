package Ex_02_Switch;

public class Lab0037_SwitchEx07 {
    public static void main(String[] args) {
        char code = 'C';
        switch (code) {
            default :
                System.out.println("Heloooo...");

            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
        }
    }
}//output will be default because code=C but there is no matching case with C
