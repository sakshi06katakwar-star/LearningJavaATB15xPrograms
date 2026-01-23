package Ex_18_Constructor;

class Login {
    String userName;
    String password;
    int age;

    Login() {
        System.out.println("Default const");}
    Login(String userName) {
        System.out.println("String arg const=> "+userName);}
    Login(String password, int age) {
        System.out.println("String and int arg const=> "+password +" === "+ age);}
}

public class Lab0078_consOverLoadingEx01 {
    public static void main(String[] args) {
        Login L1 = new Login();
        Login L2 = new Login("Sakshi");
        Login L3 = new Login("Barklays",26);


    }

}
