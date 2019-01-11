package loop.allbasicloop;

import java.util.Scanner;

//printing first n nos
public class WhileLoop {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,fact=1;
        System.out.println("enter how many u want to print");
        n=in.nextInt();
       for(int i=1;i<=n;i++)
       {
           fact=fact*i;
       }
        System.out.println("fact="+fact);
    }
}
