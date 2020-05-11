package branching;
//usage of && , ||

import java.util.Scanner;

public class IfUsingAndOr {
    public static void main(String[] args) {
 // to find whether a number is eligible by both(either) 3 and 5

        Scanner in=new Scanner(System.in);
         int n;
         System.out.println("enter a no");
         n=in.nextInt();

         if(n%3==0 || n%5==0)
         {
             if(n%3==0 && n%5==0)
             System.out.println("divisible by both");
             else
                 System.out.println("divisible by either one only");

         }
         else
             System.out.println("not divisible");




    }
}
