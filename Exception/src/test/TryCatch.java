package test;
public class TryCatch 
{
	public static void main(String[] args) 
	{
		try {
			System.out.println(2);
			try {
				System.out.println(3/0);
			}
			catch (ArrayIndexOutOfBoundsException e) 
			{
				System.out.println(4);
			}
			System.out.println(5);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Ae  "+6);
		}
		System.out.println(7);
	}
}
