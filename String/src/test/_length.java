package test;
public class _length 
{
	static String s11; 
	public static void main(String[] args) 
	{
		String s1="";
		System.out.println(s1.length());
		String s2=" ";
		System.out.println(s2.length());
		String s3="ab";
		System.out.println(s3.length());
		String s4=new String();
		System.out.println(s4.length());
		String s5=new String("");
		System.out.println(s5.length());
		String s6=new String(" ");
		System.out.println(s6.length());
		String s7=new String("ab");
		System.out.println(s7.length());
		String s8=null;
	//	System.out.println(s8.length()); //NullPointerException
		String s9="null";
		System.out.println(s9.length());
		System.out.println(s11.length());
				
	}

}
