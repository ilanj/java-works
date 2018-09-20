package branching;

import java.util.Scanner;

//to find whether a person is eligible to vote
public class IfStatement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int age;
        age=in.nextInt();

        if(age>=18)
        {
            System.out.println("eligible");
        }

    }
}
