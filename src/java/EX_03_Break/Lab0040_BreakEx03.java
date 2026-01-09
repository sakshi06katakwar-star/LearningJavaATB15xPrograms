package EX_03_Break;

public class Lab0040_BreakEx03 {
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

    }
}//when i=0 it is false as per our if condition 0 != 5 , again 1 != 5, 2!=3, 4!=5 but 5==5 here condition will be true
//hence loop will break so in break until and unless your condition is false it will print on the console but as
// condition false it comes out of loop and nothing gets printed on console as output.
// therefore in this prog output is 0 1 2 3 4
// value      condition(i==5)     output
// 0           0==5,false          0
//1            1==5,false          1
//2            2==5,false          2
//3             3==5,false          3
//4             4==5,false          4
//5             5==5,true          nothing
//also here we are printing after if condition hence o/p is 0 1 2 3 4
//Reason
//
//if (i == 5) is checked before printing
//
//When i becomes 5 → break executes immediately
//
//So print statement is never reached for 5
//
//🧠 Key Rule to Remember
//break immediately terminates the loop and skips all remaining statements in that iteration.
//So:
//
//Print Position	Result
//Before if + break	Value is printed
//After if + break	Value is skipped
