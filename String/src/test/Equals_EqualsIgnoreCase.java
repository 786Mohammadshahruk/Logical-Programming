package test;
public class Equals_EqualsIgnoreCase 
{
	public static void main(String[] args) 
	{
		String s1="a";
		String s2="a";
		String s3=new String("a");
		String s4=new String("a");
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		StringBuffer sb1=new StringBuffer("a");
		StringBuffer sb2=new StringBuffer("a");
		System.out.println(sb1==sb2);
		System.out.println();
		System.out.println(s1.equals(s2));//true
		System.out.println(s3.equals(s4));//true
		System.out.println(sb1.equals(sb2));//false
		String s5="a";
		String s6="A";
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
	}

}
