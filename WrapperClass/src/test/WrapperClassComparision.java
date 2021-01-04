package test;
public class WrapperClassComparision 
{
	public static void main(String[] args) 
	{
		int i1=10,i2=10;
		System.out.println(i1==i2);
		System.out.println();
		Integer i3=new Integer(10);
		Integer i4=new Integer(10);
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
		System.out.println();
		Double do1=new Double(10.0);
//		System.out.println(do1==i3);
		System.out.println(i3.equals(do1));
		
	}

}
