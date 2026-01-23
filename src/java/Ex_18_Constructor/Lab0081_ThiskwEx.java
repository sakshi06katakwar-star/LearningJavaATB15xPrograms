package Ex_18_Constructor;
class students {
    students() {
        this("Sakshi");
        System.out.println("Default const");}

    students(String name){
        this(true);
        System.out.println("Name is : "+name);}

    students(Boolean present) {
        this(84.6,true);
        System.out.println("Present : "+present);}

    students(Double marks, Boolean result) {
        System.out.println("Marks in % : "+marks+ " Pass :"+result);}
}

public class Lab0081_ThiskwEx {
    public static void main(String[] args) {
        students s = new students();
    }
}
