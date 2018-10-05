package programs.basicprograms;

import java.util.Scanner;

public class Si {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        //si=pnr/100
        double si;
        double p;
        double n;
        double r;

        System.out.println("enter principle");
        p=in.nextDouble();
        System.out.println("enter no of years");
        n=in.nextDouble();
        System.out.println("enter rate of interest");
        r=in.nextDouble();

        si=(p*n*r)/100;
        System.out.println("simple interest for "+p+" for a period of "+n+"years, at interest "+r+"="+si);

    }
}
