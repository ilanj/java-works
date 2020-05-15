package june16;
import java.util.*;
public class Stack16
{
	static Stack s1 = new Stack();
	static Scanner in=new Scanner(System.in);
	static int n,choice;
	static char ch;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s1 = new Stack();
		System.out.println("press 'q' to quit and any key to continue");
		while((ch=in.next().charAt(0))!='q')
		{
			System.out.println("what operation u need to perform \n1.push  \n2.pop  \n3.peek");
			choice=in.nextInt();
		switch(choice)
		{
		case 1:
			pus();
			break;
		case 2:
			popping();
			break;
		case 3:
			peeking();
			break;
		}
		System.out.println("press 'q' to quit and any key to continue");
		}
	}
	static int pus()
	{
		System.out.println("enter element to push");
		n=in.nextInt();
		s1.push(n);
		System.out.println("updated elements after pushing are"+s1);
		return 0;
	}
	static void popping()
	{
		System.out.println("enter element to pop");
		try
		{
		s1.pop();
		System.out.println("updated elements after popping are"+s1);
		}catch (Exception e)
		{
			System.out.println("stack empty");
		}
		
	}
	static void peeking()
	{
		
		System.out.println("after peek"+s1.peek());
		
	}

}
