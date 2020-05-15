package june16;
import java.util.Scanner;
public class Recursion {
	int n;// or declare this as static
	int fact(int a)
	{
		if(a==0)
			return 1;
		else 
			return(a*(fact(a-1)));
		
	}
	public static void main(String args[])
	{
		int f;
		Scanner in=new Scanner(System.in);
		Recursion ob=new Recursion();
		ob.n=in.nextInt();
		Recursion h=new Recursion();
		f=h.fact(ob.n);
		System.out.println(f);
	}
	

}
