package loop.programsonloop;

import java.util.Scanner;

public class SumOfNnos {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n,sum=0,temp;
        System.out.println("enter how many nos");
        n=in.nextInt();

        for(int i=0;i<n;i++)
        {
            System.out.println("enter "+(i+1) +" number");
            temp=in.nextInt();
            sum=sum+temp;
        }
        System.out.println("sum="+sum);
    }
}
