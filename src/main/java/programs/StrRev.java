package june16;

import java.util.Scanner;

class StrRev{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length=0,i;
		Scanner in=new Scanner(System.in);
		String s1=in.next();
		
		try {
			for(length=0;s1.charAt(length)!='\0';length++)
			{
				
			}
		}
		
catch(Exception e)
		{
	
		}
		System.out.println("string length is"+length);
		//String rev;
		char[] rev=new char[length];
		for(i=0;i<length;i++)
		{
			rev[length-1-i]=s1.charAt(i);
			
		}
		String r = new String(rev);
		System.out.println("reversed string is "+r);
		if(s1.equals(r))
			System.out.println("palindrome");
		else 
			System.out.println("not a palindrome");
		
	}
	//palindrome---------------------------------------------------------------------------------------
	
		

}
