package programs.basicprograms;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int no;
        int rem;
        int rev=0;
        System.out.println(" enter any no");
        no=in.nextInt();

        while(no!=0)
        {
            rem=no%10;
            rev=rev*10+rem;
            no=no/10;
        }
        System.out.println("after reverse   "+rev);

    }
}
