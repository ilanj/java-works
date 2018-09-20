package strings;

import java.util.Scanner;

public class Reverse {
    public static void main(String args[])
    {
        String original, reverse="";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to reverse");
        original = in.nextLine();

        int length = original.length();

        for ( int i = length - 1 ; i >= 0 ; i-- )
            reverse = reverse + original.charAt(i);
if(original.equals(reverse))
    System.out.println("it is palindrome");
else
    System.out.println("not a paindrome");

        System.out.println("Reverse of entered string is: "+reverse);
    }
}
