package june16;
import java.util.Scanner;
class series
{
public static void main(String args[])
{
	int sum=0,n;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	
for(int i=1;i<=n;i++)
{
//System.out.println(i);
sum=sum+i;
}
System.out.println(sum);
}}