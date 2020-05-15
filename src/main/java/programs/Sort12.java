package june16;
import java.util.*;
public class Sort12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
for(i=0;i<n;i++)
{
	System.out.println(a[i]);
}
	}

}
