package loop.programsonloop;

import java.util.Scanner;

//check whether a no is binary no
public class BiaryNo {
    public static void main(String[] args) {
        System.out.println("enter no");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int digit;
        int flag=0;

        while (n!=0)
        {
            digit=n%10;
            n=n/10;
            if(digit!=0 && digit!=1)
                flag=1;
        }
        if(flag==0)
            System.out.println("binary no");
        else
            System.out.println("not a binary no");

    }
}
