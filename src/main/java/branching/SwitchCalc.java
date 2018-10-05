package branching;

import java.util.Scanner;

// calcultor using switch
public class SwitchCalc {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int a,b,result;
        String ch;
        System.out.println("enter 2 operands ");
         a=in.nextInt();
         b=in.nextInt();

        System.out.println("add  sub   mul");
        System.out.println("enter choice");
        ch=in.next();

        switch (ch)
        {
            case "add":
               result=a+b;
                System.out.println("sum="+result);
                break;

            case "sub":
                result=a-b;
                System.out.println("diff="+result);
                break;

            case "mul":
                result=a*b;
                System.out.println("product="+result);
                break;

                default:
                    System.out.println("enter 1 or 2 or 3 only");
        }
    }
}
