package june16;

public class Copycons {
	int res;
	Copycons(int i)
	{
		res=i;
	}


Copycons(Copycons c)
{
	res=c.res;
}
void display()
{
	System.out.println(res);
}
public static void main(String args[])
{
	Copycons obj=new Copycons(10);
	Copycons ob=new Copycons(obj);
	obj.display();
	ob.display();
	
}
}
