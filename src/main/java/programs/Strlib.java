package june16;
import java.util.*;
public class Strlib {
	static int i=0;
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String s1=in.next();
		//TO UPPER AND BACK TO LOWER------------------------------------------------------------------
		s1=s1.toUpperCase();
		System.out.println(s1);
		s1=s1.toLowerCase();
		System.out.println(s1);
		//STRING LENGTH --------------------------------------------------------------------------------
		int length;
		System.out.println(s1.length());
		
		//equalstoooooooo--------------------------------------------------------------------------------
		String s2=in.next();
		if(s1.equals(s2))
		{
			System.out.println(s1+"  and  "+s2+"  are equal");
		}
		else
		{
			System.out.println(s1+"  and  "+s2+"  isnt equal");
		}
		//equals ignore case-----------------------------------------------------------------------------------
		System.out.println("after ignoring case");
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println(s1+"  and  "+s2+"  are equal");
		}
		else
		{
			System.out.println(s1+"  and  "+s2+"  isnt equal");
		}
		//compare to -----------------------------------------------------------------------------------
		//equal returns boolean where as compareto returns ascii diff in int so it cant be used in if directly, but can be passed to a int var first and used in if
		System.out.println("with just compareto");
		
		int j=s1.compareTo(s2);
		if(j==0)
		{
			System.out.println(s1+"  and  "+s2+"  are equal");
		}
			System.out.println(s1.compareTo(s2));
		
			System.out.println("with just compareToIgnoreCase");
			
			
			System.out.println(s1.compareToIgnoreCase(s2));
			//concat=========================================================================================
			s1=s1.concat(s2);
			System.out.println(s1.concat(s2));
			//trim-----------------------------------------------------------------------------------------
			//only trailing and leading spaces are cut but not the in between ones
			String s3="     spaces     are there      ";
			System.out.println(s3.trim());
			
			//remove white spaces---------------------this even removes multiple white spaces----------------------------------------------------
			System.out.println("enter any string to remove white spaces");
			in.nextLine();
			String s4=in.nextLine();
			s3=s4.replaceAll(" ", "");
			System.out.println(s3);
			
			//remove white spaces without using library functions------------------------------------------------------------
			
			length=s4.length();
			char[] space=new char[length];
			j=0;
			for(i=0;i<length;i++)
			{
				
				if(s4.charAt(i)!=' ')
				{
					
				space[j]=s4.charAt(i);
				j++;
				
				}
				
			}
			String s5=new String(space);
			System.out.println("removing spaces without using library functions   "+s5);
			//
	}

}
