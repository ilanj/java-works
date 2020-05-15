package june16;
import java.util.Scanner;
public class Matrixtranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
int i,j,m,n;
m=in.nextInt();
n=in.nextInt();
int a[][]=new int[m][n];
int b[][]=new int[m][n];
for(i=0;i<m;i++)
{
	for(j=0;j<n;j++)
	{
		a[i][j]=in.nextInt();
		b[j][i]=a[i][j];

	}

}

for(i=0;i<m;i++)
{
	for(j=0;j<n;j++)
	{
System.out.print("\t"+b[i][j]);
		

	}
	System.out.println();

}
}
}


