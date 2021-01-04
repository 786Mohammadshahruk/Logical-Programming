package Org.Btm.Test;
public class Test3
{
	public static void main(String[] args)
	{
		MainRunner3 m1=new MainRunner3(5);
		m1.start();
		MainRunner3 m2=new MainRunner3(10);
		m2.start();
		MainRunner3 m3=new MainRunner3(15);
		m3.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("main:"+i);
		}
	}
}
