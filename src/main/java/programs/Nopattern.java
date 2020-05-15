package june16;
import java.util.Scanner;
public class Nopattern {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n,i,j;
		n=in.nextInt();
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("\t"+j);
			}
			System.out.println();
			
		}
		//lower half------------------------------------------------------------------------------------------------
		for(i=n-1;i>=0;i--)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("\t"+j);
			}
			System.out.println();
			
		}
	}

}
