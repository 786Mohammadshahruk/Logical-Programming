package Org.Btm.Numbers;
public class Sample 
{
	int x=10;
	int y=20;
	@Override
	public int hashCode() 
	{
		return x*y;
	}
	public static void main(String[] args) 
	{
		Sample sample1=new Sample();
		Sample sample2=new Sample();
		//System.out.println(sample1.hashCode());
		//System.out.println(sample2.hashCode());
		String s1="amrit";
		System.out.println(s1);
		
		
		
	}

}
