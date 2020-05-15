package june16;
import java.util.*;
public class Search11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,i,search;
Scanner in=new Scanner(System.in);
System.out.println("enter the size");
n=in.nextInt();
int a[]=new int[n];
System.out.println("enter the elements");
for(i=0;i<n;i++)
{
	a[i]=in.nextInt();
}
System.out.println("enter the search element");
search=in.nextInt();
for(i=0;i<n;i++)
{
if(search==a[i])
	break;
}
try
{
if(a[i]==search)
	System.out.println("element found");
else
	System.out.println("element not found");
}   //catch(Exception e)
finally
{
System.out.println("array excetion");
}
}
}
