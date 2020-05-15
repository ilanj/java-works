//find character count in a string
package programs.basicprograms;

import java.util.Scanner;

public class CharOccurence {
    public static Scanner in=new Scanner(System.in);
    public static String input;
    public static int occurence=0;
    public static  char[] ch;
    public static void main(String[] args) {
        System.out.println("enter any string");
        input=in.next();
       // char[] inpArray=input.toCharArray();
       int len=input.length();
       String temp="";

       for(int i=0;i<len;i++)
       {
           for(int j=0;j<len;j++)
           {
               if(input.charAt(i)==input.charAt(j))
               {
                   ++occurence;

               }
           }
           temp=temp+input.charAt(i);
           //System.out.println(temp);
           int occurrences=0;
           for(char ch:temp.toCharArray())
           {
               if(ch==input.charAt(i))
                   ++occurrences;
           }
           //System.out.println(occurrences);

           if(occurrences==occurence)
           System.out.println(input.charAt(i)+" occurs "+ occurence);
           occurence=0;
       }

    }
}
