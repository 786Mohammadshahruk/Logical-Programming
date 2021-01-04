package Org.Btm.Test;
public class MainRunner4 extends Thread
{
	int x;
	public void setX(int x)
	{
		this .x=x;		
	}
	@Override
	public void run() 
	{
		for(int i=0;i<this.x;i++)
		{
			System.out.println(getName()+" Run:"+i);
		}
	}

}
