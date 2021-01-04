package Org.Btm.Test;
public class Sample extends Thread
{
	@Override
	public void run() 
	{
		for (int i = 11; i < 20; i++) 
		{
			System.out.println(i);			
		}
	}
	public static void main(String[] args)
	{
		Sample s1=new Sample()
				{
					@Override
					public void run() 
					{
						for (int i = 0; i < 10; i++)
						{
							System.out.println(i);
						}
					}
			
				};
		Sample s2=new Sample();
		s1.start();
		s2.start();
	}

}
