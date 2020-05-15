package june16;

import java.util.Scanner;

public class Insertarray14 {
	static int n,insertpos,insertval,i,j,choice;
	static int a[]=new int[100];
	static Scanner in=new Scanner(System.in);
	public static void main(String[]args)
	{
		
		
		Insertarray14 obj=new Insertarray14();

		n=in.nextInt();

	
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			
		}
		System.out.println("the entered elements are");
		for(i=0;i<n;i++)
		{
			System.out.print("\t"+a[i]);
			
		}
		System.out.println("enter where u want to insert \n1.beginning \n2.middle  \n3.last");
		choice=in.nextInt();
		switch(choice)
		{
		case 1:
			obj.beginning();
			break;
		case 2:
			obj.middle();
			break;
		case 3:
			obj.last();
			break;
		
		}
				//obj.middle();
		//obj.beginning();
		//obj.last();
		//n=n+1;
		//int a[]=new int[n+1];
	}
	
	
	
	
	
	void middle()
	{
		System.out.println("enter a position and value to insert");
		insertpos=in.nextInt();
		insertval=in.nextInt();
		for(i=n;i>=insertpos;i--)
		{
			
			a[i]=a[i-1];
			
		}
		a[insertpos]=insertval;
		System.out.println("after insertion elements are");
		for(i=0;i<n+1;i++)
		{
			System.out.print("\t"+a[i]);
			
		}

	}
	
	
	
	void beginning()
	{
		System.out.println("enter an element to insert at the beginning");
		insertval=in.nextInt();
for(i=n;i>=1;i--)
{
	a[i]=a[i-1];
}
a[0]=insertval;
for(i=0;i<n+1;i++)
{
	System.out.print("\t"+a[i]);
	
}
	}
	
	
	
	void last()
	{
		System.out.println("enter an element to insert at the last");
		insertval=in.nextInt();
		a[n]=insertval;
		for(i=0;i<n+1;i++)
		{
			System.out.print("\t"+a[i]);
			
		}
		
		
	}

}
