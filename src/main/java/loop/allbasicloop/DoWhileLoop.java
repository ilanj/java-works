package loop.allbasicloop;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,i;
        i=0;

        System.out.println("enter how many nos u want");
        n=in.nextInt();

        do
        {
            System.out.println(i);
            i++; //i=i+1;

        }while(i<=n);
        System.out.println("now i="+i);
    }
}
