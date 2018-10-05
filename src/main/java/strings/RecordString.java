package strings;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.exit;

public class RecordString {
    static ArrayList<String> names=new ArrayList<String>();
    static   Scanner in=new Scanner(System.in);


    public static void main(String[] args)
    {
        int ch=0;

        while(true)
        {
            System.out.println("enter choice \n 1.add  \n 2.search \n 3.display \n 4.Exit");
            ch=in.nextInt();

            switch(ch)
            {

                case 1:
                    append();
                    break;

                case 2:
                    search();
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    exit_now();
                    break;
            }
        }
    }

    static void append()
    {
        System.out.println("enter any string ");
        String s;
        s=in.next();
        names.add(s);
    }

    static void search()
    {
        String search;
        int len;
        System.out.println("enter the string to search");
        search=in.next();
        len=search.length();
        for(String s1:names)
        {
            if(s1.startsWith(search))
                System.out.println(s1);
        }
    }
    static void exit_now()
    {
        exit(0);
    }

    static void display()
    {
        names.forEach(System.out::println);

    }
}
