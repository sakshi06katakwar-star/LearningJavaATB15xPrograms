import java.util.Scanner;

public class Task23_PrimeNumberCheckerScanner {
   // Write a program to check if a given number is prime. A prime number is only divisible by 1 and itself.
   //A number is prime if  :
   //It is greater than 1
   //It has only 2 divisors → 1 and itself
   //No divisors found → Prime ✅
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a num");
      int num = sc.nextInt();
      boolean isPrime = true;

      if(num<=1){
         isPrime = false;
      } else {
         for(int i=2; i<=num/2; i++) {  //Why do we start from i = 2? Because:
                                       // Every number is divisible by 1 Every number is divisible by itself
                                      //If we check from 1:num % 1 == 0  → always true ❌So it’s useless.
                                     //We start from 2, the smallest possible divisor.
            if(num%i == 0) {        //num/2 because no divisor exists after half because A number cannot have a
                                   // divisor greater than its half
               isPrime = false;
               break;
            }
         }
      }
      if(isPrime) {
         System.out.println(num+" is a Prime num");
      } else {
         System.out.println(num+" is not a Prime num");
         sc.close();
      }


   }
}
