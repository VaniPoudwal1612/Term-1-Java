import java.util.Scanner;
class testfunc41
{
	static int sum(int a, int b)
	{
		int c = a+b;
		return c;
	}

	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers :: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int x = testfunc41.sum(a,b);
		System.out.println("Result = "+x);	
	}
}