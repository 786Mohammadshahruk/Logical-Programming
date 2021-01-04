package test;
public class setLength 
{
	public static void main(String[] args) 
	{
		String s1="a";
		String s2="a";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println();
		String sn1=new String("a");
		String sn2=new String("a");
		System.out.println(sn1==sn2);
		System.out.println(sn1.equals(sn2));
		System.out.println();
		StringBuffer sb1=new StringBuffer("a");
		StringBuffer sb2=new StringBuffer("a");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
	}

}
