package Ex_18_Constructor;
//why we write this.something in code?
class Tour {
    String country;
    int members_count;
    String names;
    boolean confirmed;

    Tour(String country) {
        System.out.println("Name of countries involved in tour : "+country);
        this.country = country;
    }
    Tour(int members_count) {
        System.out.println("Total no. of members going on tour : "+members_count);
        this.members_count = members_count;
    }
    Tour(boolean confirmed) {
        System.out.println("Confirmed for trip : "+confirmed);
        this.confirmed = confirmed;

    }
}
public class Lab0079_ThisKW_Ex02 {
    public static void main(String[] args) {
        Tour t1 = new Tour("Maximum Europe");
        Tour t2 = new Tour(24);
        Tour t3 = new Tour(true);

    }//if we have more than 1 constr then it is called const overloading.
}
