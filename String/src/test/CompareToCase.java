package test;
public class CompareToCase 
{
	public static void main(String[] args) 
	{
		String s1="a";
		String s2="a";
		String s3="A";
	//	System.out.println(s1.equals(s2));
	//	System.out.println(s3.compareToIgnoreCase(s1));
	//	System.out.println(s1.equals(s3));
		String s4="abcd";
		String s5="abc ";
	//	System.out.println(s4.equals(s5));
		System.out.println(s4.compareTo(s5));
		System.out.println(s4.equalsIgnoreCase(s5));
		String s6="abcdef";
		System.out.println(s4.compareTo(s6));
		System.out.println(s6.compareTo(s4));
		
	}

}
