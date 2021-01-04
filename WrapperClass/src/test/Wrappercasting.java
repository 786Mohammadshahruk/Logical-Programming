package test;
public class Wrappercasting 
{
	public static void main(String[] args) 
	{
		Byte b1= new Byte((byte)10);
//		Integer i1=b1;
//		Integer i2=(Integer)b1;
		Integer i3=new Integer(10);
//		System.out.println(b1==i3);
		System.out.println(b1.equals(i3));
		Integer i4=new Integer(20);
		System.out.println(i3.equals(i4));
	}

}
