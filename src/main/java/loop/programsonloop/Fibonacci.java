package loop.programsonloop;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=0;
        int b=1;
        int next;
        int n;
        n=in.nextInt();
        System.out.print(a+"  "+b);
        for(int i=0;i<n;i++)
        {
            next=a+b;
            System.out.print("  "+next);
            a=b;
            b=next;
        }
    }
}
