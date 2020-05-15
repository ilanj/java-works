package june16;
import java.util.Scanner;
public class Split {
	public static void main(String args[])
	{
		
	int i;
Scanner in=new Scanner(System.in);
String s=in.nextLine();
String a[]=s.split(" ");
for(i=0;i<a.length;i++)
{
	String b[]=a[i].split(":");
	System.out.println(b[0]+"\t"+b[1]);
}
}
}