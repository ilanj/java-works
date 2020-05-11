package branching;

import java.util.Scanner;

//eligiblity for vote
public class IfAge {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        int age;
        System.out.println("enter age");
        String name;
        name=in.nextLine();
        age=in.nextInt();
//to check whether a person is eligible to vote and stand in election
        //to stand in election age must be greater than 25

        if (age>=18)
        {
            if(age>=25)
                System.out.println(" eligible to vote as well as nominate himself for election");
            else
                System.out.println("eleigible to vote but cant nominate for election");
        }
        else
        {

            System.out.println("not eligible to vote and nominate for election");
        }
    }

}
