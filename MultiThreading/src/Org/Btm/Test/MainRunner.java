package Org.Btm.Test;
public class MainRunner extends Thread 
{
	@Override
	public void run() 
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) throws Exception 
	{
		MainRunner m=new MainRunner();
		m.start();
		for(int i=11;i<20;i++)
		{
			System.out.println(i);
			Thread.sleep(50);
		}
		
	}
	
}
