package others_check;

import java.util.Scanner;

public class Recursion {
    static int n, fact = 1;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("enter n");
        n = in.nextInt();

        fact = factorial(n);
        System.out.println("factorial=" + fact);

    }

    static int factorial(int no) {

        if (no == 1 || no == 0)
            return fact;
        else
            return fact = no * factorial(no - 1);

    }
}
