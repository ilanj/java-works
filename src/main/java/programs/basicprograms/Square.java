package programs.basicprograms;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n;
        int sq;
        System.out.println("enter any no to find square");
        n=in.nextInt();
        sq=n*n;
        System.out.println("Square="+(sq));
        MethodsDemo mo=new MethodsDemo();
        System.out.println("div="+mo.division(25,36));

    }
}
