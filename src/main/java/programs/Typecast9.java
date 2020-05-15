package june16;
import java.util.Scanner;
public class Typecast9 {
	float c=98;
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		float f=99;//=in.nextFloat();
		float f1=in.nextFloat();
		int i1=in.nextInt();
		int i=(int)f;
		f1=(int)f1;
		float f2=(float)i1;
		System.out.println(i+"\n"+f+"\n"+f1+"\n"+i1);
		
	}

}
