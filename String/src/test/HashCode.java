package test;
public class HashCode 
{
	public static void main(String[] args) 
	{
		String s1=new String("a");
		System.out.println(s1.hashCode());
		String s2=new String("a");
		System.out.println(s2.hashCode());
		String s3=new String("abc");
		System.out.println(s3.hashCode());
		System.out.println();
		System.out.println(System.identityHashCode(s1));
		
	}

}
