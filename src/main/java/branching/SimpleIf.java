package branching;

import java.util.Scanner;

//eligible to vote age greater than or equal to 18
public class SimpleIf {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("enter age");
        int age=in.nextInt();
         if(age>=18)
         {
             System.out.println("eligible");
         }

    }
}
