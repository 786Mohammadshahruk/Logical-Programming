package test;
public class _15ContentEqualTest 
{
	public static void main(String[] args) 
	{
		String s1=new String("a");
		String s2=new String("a");
		StringBuffer sb=new StringBuffer("a");
		System.out.println(s1.equals(s2));
		System.out.println(s1.contentEquals(s2));
		System.out.println();
		System.out.println(s1.equals(sb));
		System.out.println(s1.contentEquals(sb));		
		
	}

}
