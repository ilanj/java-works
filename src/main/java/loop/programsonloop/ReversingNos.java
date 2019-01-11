package loop.programsonloop;

import java.util.Scanner;

public class ReversingNos {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        int rem;
        int rev=0;
        System.out.println("enter n");
        n=in.nextInt();

        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}
