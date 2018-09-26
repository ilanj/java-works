package strings;

import java.util.Scanner;

public class Reverse {
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);

       String name=in.nextLine();
       String reverse="";
       int len=name.length();
       for(int i=len-1;i>=0;i--)
       {
           reverse=reverse+name.charAt(i);
       }
        System.out.println(reverse);

       if(name.equals(reverse))
           System.out.println("palindrome");
       else
           System.out.println("not a palindrome");


    }
}
