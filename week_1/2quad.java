//2. Write a Java program that prints all real and imaginary solutions to the quadratic
//equation ax2 + bx + c = 0. Read in a, b, c and use the quadratic formula
import java.util.*;
import java.lang.Math;
class root
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a,b,c values: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int det=(b*b)-(4*a*c);
		System.out.println("Determinant is :"+det);
		if(det>0)
		{	
			//root 1,2;
			double r1=(-b+Math.sqrt(det))/(2*a); //Math class is avilable in java.lang package
			double r2=(-b-Math.sqrt(det))/(2*a);
			System.out.println(r1+"   "+r2);
		}
		else if(det==0)
		{
			double r1=(-b)/(2*a);
			System.out.println(r1+"   "+r1);
		}
		else
		{
			// System.out.print(-b+"+");
			// System.out.println(Math.sqrt(-det)/(2*a)+"i");
			float temp=(float) Math.sqrt(-det)/(2*a);
			System.out.format("%d+%.2f i\n",-b/(2*a),temp);
			System.out.printf("%d-%.2f i\n",-b/(2*a),temp);
			// System.out.format("%d+%.2lf i\n",-b/(2*a),Math.sqrt(-det)/(2*a));
			// System.out.println(-b+"-"+Math.sqrt(-det)/(2*a)+"i");
		}		
	}
}	
