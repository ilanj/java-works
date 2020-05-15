package june16;
import java.util.Scanner;
public class pyramid {
public static void main(String args[])
{
	int a,i,j,k;
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	//b=in.nextInt();
	for(i=0;i<=a;i++)
	{
		for(j=0;j<=(a-i);j++)
		{
			System.out.print(" ");
		}
		for(k=0;k<=i;k++)
			System.out.print("* ");
			System.out.println("\n");
	}
	
	
	//System.out.println("sum of \t"   +a+   "and"   +b+  "is \n"   +c);
}
}
