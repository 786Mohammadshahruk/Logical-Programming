package test;

public class singletonClass 
{
	private static singletonClass sc=new singletonClass();
	
	private singletonClass()
	{
		
	}
	public static singletonClass getsingletonClass()
	{
		return sc;		
	}

}
class test
{
	public static void main(String[] args) 
	{
		singletonClass s1=singletonClass.getsingletonClass();
		singletonClass s2=singletonClass.getsingletonClass();
		singletonClass s3=singletonClass.getsingletonClass();
		
	}
}
