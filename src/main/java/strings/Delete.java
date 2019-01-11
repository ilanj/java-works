package strings;

import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String name;

        System.out.println("enter name");
        name=in.nextLine();
        System.out.println(name);

        String words[]=name.split(" ");

        for(String s:words)
            System.out.println(s);



    }
}
