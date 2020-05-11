package loop.programsonloop;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        int rem;
        int sum=0;
        System.out.println("enter n");
        n=in.nextInt();

        while(n!=0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);
    }
    }

