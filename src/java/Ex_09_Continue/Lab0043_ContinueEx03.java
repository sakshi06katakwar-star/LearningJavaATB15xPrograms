package Ex_09_Continue;

public class Lab0043_ContinueEx03 {
    public static void main(String[] args) {
        //Print Even num from 1 to 50 using Continue
        for(int i=0; i<=50; i++) {
            if(i % 2 !=0) {
                continue;
            }
            System.out.println(i);
        }
    }
}//here due to continue we have to use reverse logic (i % 2 !=0) and if we want to print odd num logic will be
//(i % 2 ==0) because continue works reverse
//using continue we want to say that check for condition and skip it don't print it and rest part you can print
//that's why with continue we have to use reverse logic that's why here we are writing cond as (i % 2 !=0) because
//if we will write (i % 2 ==0) so continue will skip this cond and print odd num.
