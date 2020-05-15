package june16;
import java.util.Scanner;
public class Occurrencesofalpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		//System.out.println("enter no of strings");
		/*int i,n=in.nextInt();
		String str[]=new String[n];
		
		for(i=0;i<n;i++)
		{
		str[i]=in.next();	
		}
		*/
		
		int i,j,n=0;
		String str=in.nextLine();
		System.out.println(str.length());
		String a[]=str.split(" ");
for(i=0;i<a.length;i++)
{
	char c;
	for(j=0;j<a[i].length();j++)
	{
		c=a[i].charAt(j);
		if(c=='a')
			n++;
	}
	System.out.println(" in "+a[i]+" there are "+n+" a present");
	n=0;
}
	}

}
