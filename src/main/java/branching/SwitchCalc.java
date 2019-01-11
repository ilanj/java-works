package branching;

import java.util.Scanner;

// calcultor using switch
public class SwitchCalc {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int a,b,result;
        char ch;
        System.out.println("enter 2 operands ");
         a=in.nextInt();
         b=in.nextInt();

        System.out.println("1.+ \n2.-\n 3.*");
        System.out.println("enter choice");
        ch=in.next().charAt(0);

        switch (ch)
        {
            case '+':
               result=a+b;
                System.out.println("sum="+result);
                break;

            case '-':
                result=a-b;
                System.out.println("diff="+result);
                break;

            case '*':
                result=a*b;
                System.out.println("product="+result);
                break;

                default:
                    System.out.println("enter 1 or 2 or 3 only");
        }
    }
}
