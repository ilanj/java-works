//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>P Y R A M I D<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
package june16;
import java.util.Scanner;
public class Nopattern2 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n,i,j,k;
		n=in.nextInt();
		for(i=0;i<=n;i++)
		{
			for(k=i;k<n;k++)
				System.out.print(" ");
			for(j=0;j<=i;j++)
			{
				//left one space ----------right 2 space
				System.out.print(j);
			}
			System.out.println();
			
		}
		
		//lower half------------------------------------------------------------------------------------------------
		for(i=n-1;i>=0;i--)
		{
			for(k=i;k<n;k++)
				System.out.print(" ");
			for(j=0;j<=i;j++)
			{
				//left one space ----------right 2 space
				System.out.print(j);
			}
			System.out.println();
			
		}
	}

}
