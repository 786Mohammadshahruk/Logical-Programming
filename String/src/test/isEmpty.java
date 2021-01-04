package test;
// public boolean isEmpty()
public class isEmpty 
{
	public static void main(String[] args) 
	{
		String s1="";
		System.out.println(s1.isEmpty()); //true
		String s2=" ";
		System.out.println(s2.isEmpty()); //false
		String s3="a";
		System.out.println(s3.isEmpty()); //false
		String s4=new String();
		System.out.println(s4.isEmpty()); //true
		String s5=new String("");
		System.out.println(s5.isEmpty()); //true
		String s6=new String(" ");
		System.out.println(s6.isEmpty()); //false
		String s7=new String("a");
		System.out.println(s7.isEmpty()); //false
		String s8=null;
		System.out.println(s8.isEmpty()); //null Pointer Exception
		String s9=new String(s8);
		System.out.println(s9);
	}

}
