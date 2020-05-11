package branching;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("enter n");
        int n=in.nextInt();

         if(n%2==0)
             System.out.println("even");
         else
             System.out.println("odd");
    }
}
