package programs.basicprograms;

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int a;
        int b;

        System.out.println("enter a and b");
        a=in.nextInt();
        b=in.nextInt();


        int result = a + b;
        System.out.println("sum=" + result);

        result = a - b;
        System.out.println("diff=" + result);
        result = a * b;
        System.out.println("prod=" + result);
        result = a / b;
        System.out.println("div=" + result);
        result = a % b;
        System.out.println("rem=" + result);



    }

}
