package loop.programsonloop;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n,prod=1;
        System.out.println("enter how many nos");
        n=in.nextInt();

        for(int i=1;i<=n;i++)
        {
            prod=prod*i;
        }
        System.out.println("prod="+prod);
    }
}
