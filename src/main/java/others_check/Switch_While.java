package others_check;

import java.util.Scanner;

import static java.lang.System.exit;

public class Switch_While {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int a=10,b=20;


        while(true) {
            System.out.println("enter choice \n 1.add \n 2.sub \n 3.product \n 4.exit");
            int ch=in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println(a + b);
                    break;

                case 2:
                    System.out.println(a - b);
                    break;

                case 3:
                    System.out.println(a * b);
                    break;

                case 4:
                    exit(0);

                default:
                    System.out.println("enter choice again");
            }
        }
    }
}
