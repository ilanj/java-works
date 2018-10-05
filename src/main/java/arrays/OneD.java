package arrays;

import java.util.Scanner;

public class OneD {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter n");
        int n=in.nextInt();
        int sum=0;

        int[] a=new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("enter "+(i+1)+" number");
            a[i]=in.nextInt();
        }

        for (int i=0;i<n;i++)
        {
            System.out.println("a["+i+"]"+a[i]);
            sum=sum+a[i];
        }
        System.out.println("sum="+sum);
    }
}
