package test;
public class WrapperClassDemo2 
{
	public static void main(String[] args) 
	{
		Integer io3=Integer.valueOf(254);
		System.out.println(io3);
		int x= io3.intValue();
		System.out.println(x);
		byte b = io3.byteValue();
		System.out.println(b);
		short s=io3.shortValue();
		System.out.println(s);
		float f=io3.floatValue();
		System.out.println(f);
		char ch1 = (char)io3.intValue();
		System.out.println(ch1);
		Integer io1=new Integer("10");
		System.out.println(io1);
		Integer io2=Integer.valueOf("1");
		System.out.println(io2);
		Byte by=Byte.valueOf("1");
		System.out.println(by);
		Byte by1=Byte.valueOf((byte)128);
		System.out.println(by1);
//		Integer io4=Integer.valueOf("a");
//		System.out.println(io4);
		Integer io5=new Integer("5.3");
		System.out.println(io5);
	}

}
