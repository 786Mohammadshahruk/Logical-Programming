package Org.Btm.Test;
public class MyRunnable implements Runnable
{
	@Override
	public void run() 
	{
		for(int i=1;i<6;i++)
		{
			System.out.println(i);
		}		
	}
	public static void main(String[] args) 
	{
		Runnable m=new MyRunnable();
		Thread t =new Thread(m);
		t.start();
		for(int i=6;i<11;i++)
		{
			System.out.println(i);
		}
		
	}

}
