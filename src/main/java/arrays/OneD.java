package arrays;

import java.util.Scanner;
//sum of n nos
public class OneD {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter n");
        int n=in.nextInt();
        int sum=0;
        int flag=0;
        int search;
        System.out.println("enter the no u want to search");
        search=in.nextInt();
        int[] a=new int[n];

        for (int i=0;i<n;i++)
       {
           System.out.println(" enter no");
           a[i]=in.nextInt();
       }

        for (int i=0;i<n;i++)
        {
            if(search==a[i])
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("search not found");
        else
            System.out.println(" element found");
        //System.out.println("sum="+sum);

    }
}
