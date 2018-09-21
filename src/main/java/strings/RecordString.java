package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class RecordString {
    static ArrayList<String> names=new ArrayList<String>();
    static   Scanner in=new Scanner(System.in);


    public static void main(String[] args)
    {

        int ch;
        System.out.println("enter choice 1.add  2.display");
        ch=in.nextInt();

        switch(ch)
        {
            case 1:
                append();
                break;

            case 2:
                display();
                break;

        }
    }

    static void append()
    {
        String s;
        s=in.nextLine();

    }

    static void display()
    {

    }


}
