package test;
public class Garbage 
{
	public static void main(String[] args) 
	{
		Garbage g1=new Garbage();
		Garbage g2=new Garbage();
		Garbage g3=new Garbage();
		
		g1=g2;
		g2=g3;
		g3=g1;
		System.out.println(g1);
		
	}

}
