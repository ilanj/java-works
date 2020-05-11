package loop;

import java.util.Scanner;

//print sum first n nos
public class Looping {
    public static void main(String[] args) {
        Scanner in=new Scanner((System.in));
        int sum=0;
        System.out.println("enter n");
        int n=in.nextInt();

        for(int i=0;i<n;i++)
        {
            int j=in.nextInt();
            sum=sum+j;
        }
        System.out.println(" sum="+sum);
    }
}
