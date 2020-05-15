package june16;

class Sec1
{
	
	String s="super super class variable";
}
class Sec2 extends Sec1
{
	String s="super class variable";
	void demo()
	{
		System.out.println(super.s);	
	}
}
public class Suiper extends Sec2{
String s="base class instance variable";
void display()
{
	String s="base class local variable in main";
	System.out.println(s);
		System.out.println(this.s);
	System.out.println(super.s);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Suiper o=new Suiper();
		o.display();
		System.out.println("in main o.s is printing"+o.s);
		o.demo();
	}

}
