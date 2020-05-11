package loop.programsonloop;

import java.util.Scanner;

// sumof n nos
public class SumOfFirstNnos {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n,sum=0;
        System.out.println("enter how many nos");
        n=in.nextInt();

        for(int i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum="+sum);
    }
}
