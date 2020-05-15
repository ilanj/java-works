//reverse each word
package programs.basicprograms;

import java.util.Scanner;

public class WordsReverse {
    public static Scanner in=new Scanner(System.in);
    public static String str="";
    public static char[] inp=null;
    public static String[] line=new String[50];
public static void main(String[] args) {
        str=in.nextLine();
        inp=str.toCharArray();
        int j=-1;
        line[++j]="";
        for(int i=0;i<inp.length;i++)
        {

            if(inp[i]!=' ')
            {

               line[j]=line[j]+inp[i];
            }
            else
            {
                while(inp[i]==' ')
                    i++;
                --i;
                line[++j]="";

            }
        }
for(String s:line)
{
    if(s!=null)
        System.out.println(reverse(s));
}

    }
    public static String reverse(String s)
    {
        char[] ch=null;
        ch=s.toCharArray();
        String reverse="";
        for(int i=ch.length-1;i>=0;i--)
        {
            reverse=reverse+ch[i];
        }
        return reverse;
    }
}
