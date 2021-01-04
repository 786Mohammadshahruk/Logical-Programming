package Test;

import java.util.Enumeration;
import java.util.Vector;

public class vector 
{
	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.add(10);
		v.add("a");
		System.out.println(v);
		Enumeration e=v.elements();
		while (e.hasMoreElements()) {
			Object obj = e.nextElement();
			System.out.println(obj);
			
		}
	}
}
