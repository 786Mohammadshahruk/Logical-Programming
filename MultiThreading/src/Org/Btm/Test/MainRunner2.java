package Org.Btm.Test;
public class MainRunner2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(getName()+"run:"+i);
		}
	}
	public static void main(String[] args) 
	{
		MainRunner2 m1=new MainRunner2();
		m1.start();
		MainRunner2 m2=new MainRunner2();
		m2.start();
		MainRunner2 m3=new MainRunner2();
		m3.start();
	}
}
