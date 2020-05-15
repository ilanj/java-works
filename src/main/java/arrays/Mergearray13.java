package june16;
import java.util.*;
public class Mergearray13 {
	
public static void main(String[]args)
{
	int n,m,i,j;
	Scanner in=new Scanner(System.in);
	m=in.nextInt();
	n=in.nextInt();

	int a[]=new int[m];
	int b[]=new int[n];
	int c[]=new int[n+m];
	for(i=0;i<m;i++)
	{
		a[i]=in.nextInt();
		
	}
	for(i=0;i<n;i++)
	{
		b[i]=in.nextInt();
		
	}
	for(i=0;i<m;i++)
	{
		c[i]=a[i];
	}
	for(i=m,j=0;j<n;j++,i++)
	{
		c[i]=b[j];
	}
	for(i=0;i<(m+n);i++)
		System.out.println(c[i]);
}
}
