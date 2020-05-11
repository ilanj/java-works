package arrays;

import java.util.Scanner;

public class TwoDMulti {
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
                c[i][j]=0;
                for(int k=0;k<3;k++)
                c[i][j]=c[i][j]+a[i][k]*b[k][j];
                System.out.print("\t"+c[i][j]);
            }
            System.out.println();
        }
    }
}
