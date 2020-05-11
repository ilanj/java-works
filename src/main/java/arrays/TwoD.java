package arrays;

import java.util.Scanner;
//matrix addition
public class TwoD {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i,j;
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];

        //a input
        for(i=0;i<3;i++)
        {
            for (j=0;j<3;j++)
            {
                System.out.print("enter element a["+i+"]"+"["+j+"]");
                a[i][j]=in.nextInt();
            }
        }

        //b input
        for(i=0;i<3;i++)
        {
            for (j=0;j<3;j++)
            {
                System.out.print("enter element b["+i+"]"+"["+j+"]");
                b[i][j]=in.nextInt();
            }
        }

        //sum c
        for(i=0;i<3;i++)
        {
            for (j=0;j<3;j++)
            {
               c[i][j]=a[i][j]+b[i][j];
                System.out.print("\t"+c[i][j]);
            }
            System.out.println();
        }
    }
}
