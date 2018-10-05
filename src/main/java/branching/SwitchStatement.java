package branching;

import java.util.Scanner;

//printing numbers
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        int n;

        System.out.println("enter any no");
        n=on.nextInt();

        switch(n)
        {
            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("two");
                break;

            case 3:
                System.out.println("three");
                break;

            case 4:
                System.out.println("four");
                break;

                default:
                    System.out.println("invalid .. plz enter nos between 1 to 4");


        }
    }
}
