package loop.allbasicloop;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,i;

        System.out.println("enter how many nos u want");
        n=in.nextInt();

        for(i=0;i<=n;i++)
        {
            System.out.println(i);

        }
    }
}
