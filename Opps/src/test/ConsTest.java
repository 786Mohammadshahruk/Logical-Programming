package test;

public class ConsTest 
{
	final int x;
	{
		x=20;
	}
	public ConsTest() 
	{
		//x=20;
	}
	public static void main(String[] args) 
	{
		System.out.println("hello");
		ConsTest ct = new ConsTest();
		System.out.println(ct.x);
		
		
	}
}
