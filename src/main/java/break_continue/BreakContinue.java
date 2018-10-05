package break_continue;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;

        System.out.println("enter n");
        n=in.nextInt();
        System.out.println("example for break");
        for(int i=0;i<n;i++)
        {
            if(i==4)
                break;
            System.out.println(i);

        }
        System.out.println("example for continue");

        for(int i=0;i<n;i++)
        {
            if(i==4)
                continue;
            System.out.println(i);

        }

    }
}
