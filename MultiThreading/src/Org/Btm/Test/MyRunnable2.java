package Org.Btm.Test;
public class MyRunnable2 implements Runnable
{
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);			
		}
	}
	public static void main(String[] args)
	{
		Runnable r=new MyRunnable2();
		Thread t=new Thread(r);
		Runnable r1=new Runnable() {
			
			@Override
			public void run() 
			{
				for(int i=6;i<=10;i++)
				{
					System.out.println(i);
				}
			}
		};
		Thread t2=new Thread();
		t.start();
		t2.start();
	}

}
