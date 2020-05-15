/*
The Stack class extends Vector
boolean empty() - Tests if this stack is empty. Returns true if the stack is empty,
and returns false if the stack contains elements.
Object peek( ) - (remeber lifo) Returns the element on the top of the stack, but does not remove it.
Object pop( ) - Returns the element on the top of the stack, removing it in the process.
Object push(Object element) - Pushes the element onto the stack. Element is also returned.
int search(Object element) - Searches for element in the stack. If found, its
 offset from the top of the stack is returned. Otherwise, -1 is returned.
 */
package collections.vector;
import java.util.*;
public class StackOps
{
	static Stack s1 = new Stack();
	static Scanner in=new Scanner(System.in);
	static int n,choice;
	static char ch;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
