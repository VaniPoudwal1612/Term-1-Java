import java.util.Scanner;
class testfunc42
{
	public static void main (String args[])
	{
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :: ");
		int i = 1;
		int f = 1;
		int number = 5;

		for(i=1;i<=number;i++)
		{
			f = f*i;
		}
		System.out.println("Factorial of "+number+" is: "+f);
	}
}