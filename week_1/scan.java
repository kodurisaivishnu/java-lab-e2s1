//To create objects General Format:
//classname obj =new classname();
//Scanning: Scanner sc new Scanner(System.in);
import java.util.*;
class add
{
	public static void main(String args[])
	{
		int a,b,sum;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a and b value respectively: ");
		a=sc.nextInt();
		b=sc.nextInt();
		sum=a+b;
		System.out.println("Sum "+a+" and "+b+" is "+sum);
		sc.close();
	}

}
