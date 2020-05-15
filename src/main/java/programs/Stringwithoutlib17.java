package june16;
import java.util.Scanner;
public class Stringwithoutlib17 {
	public static void main(String args[])
	{
		int i=0;
		Scanner in=new Scanner(System.in);
	String s1,s2,s3;
	s1=in.nextLine();
	s2=s1;
	System.out.println(s1);
	System.out.println(s2);
//length-java strings are not terminated by null char
	//string cannot be useed in array need to convert to char array
	char[] ch;
	ch=s1.toCharArray();
	
	for(char c:ch)
	{
		
		i++;
	}
	System.out.println("string length is"+i);
	//recerse
	--i;
	char[] ch1=new char[i];
	for(int size=0;i>=0;size++)
	{
		ch1[i]=ch[size];
		--i;
		System.out.println("reversed string is"+ch1);
	}
	System.out.println("reversed string is"+ch1);
	
	}

}
