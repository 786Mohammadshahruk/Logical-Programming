package Org.Btm.Test;

public class trycatch 
{
	public static void main(String[] args) 
	{
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("hi");
		}
		catch(Exception e1)
		{
			
		}
		
	}

}
