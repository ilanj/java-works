package strings;

import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String name;

        System.out.println("enter name");
        name=in.nextLine();
        //regex-\\d-\\w
        name=name.replaceAll("\\D","");
        System.out.println(name);


    }
}
