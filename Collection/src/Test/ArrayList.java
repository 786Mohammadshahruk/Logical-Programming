package Test;

import java.util.Collections;
import java.util.Enumeration;

public class ArrayList 
{
	public static void main(String[] args) 
	{
		java.util.ArrayList al=new java.util.ArrayList();
		al.add(10);
		al.add("a");
		Enumeration e=Collections.enumeration(al);
		while(e.hasMoreElements())
		{
			System.out.println(e);
			Object obj=e.nextElement();
			System.out.println(obj);
		}
	}
}
