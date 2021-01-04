package test;
public class WrapperClassDemo 
{
	public static void main(String[] args) 
	{
		int i=50;
		Integer io1=new Integer(i);
		Integer io2=Integer.valueOf(i);
		System.out.println("io1 "+io1);
		System.out.println("io2 "+io2);
		System.out.println();
//		Byte b=new Byte(50); compilation error
		Byte b=new Byte((byte)50);
		System.out.println("Byte "+b);
		Character ch1=new Character('a');
//		Character ch2=new Character(97); compilation
		Character ch2=new Character((char)97);
		System.out.println(ch2);
		Boolean bo=new Boolean(true);
		System.out.println(bo);
		Float f1=new Float(70);
		System.out.println(f1);
		Float f2=new Float(32.57);
		System.out.println(f2);
		Float f3= new Float(50.45f);
		System.out.println(f3);
		Double d1=new Double(67.54);
		System.out.println(d1);
		Double d2=new Double(67);
		System.out.println(d2);
		Double d3=new Double('a');
		System.out.println(d3);
		
	}

}
