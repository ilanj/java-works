package june16;

public class Copycons1 {
	int res;
	Copycons1(int i)
	{
		res=i*i;
		System.out.println(res);
	}


Copycons1()
{
	System.out.println(res);
}
void display()
{
	System.out.println(res);
	
}
public static void main(String args[])
{
	Copycons1 obj=new Copycons1(10);
	
	Copycons1 ob=new Copycons1();
	ob.res=obj.res;
	obj.display();
	ob.display();
	
}
}
