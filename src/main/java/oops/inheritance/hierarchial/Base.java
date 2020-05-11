package oops.inheritance.hierarchial;

import java.util.Scanner;

public class Base {
    int getInput()
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        return  n;
    }
}
