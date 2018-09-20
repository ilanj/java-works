package programs.basicprograms;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n;
        System.out.println("enter any no to find square");
        n=in.nextInt();

        System.out.println("Square="+(n*n));

    }
}
