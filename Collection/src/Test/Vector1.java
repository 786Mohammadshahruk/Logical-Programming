package Test;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 
{
	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		//By using enumeration
	    /*Enumeration e=v.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());*/
		
		//By using iterator
		/*Iterator it=v.iterator();
	    while (it.hasNext()) 
        {
	    	Integer i=(Integer) it.next();
	    	if(i%2==0)
	    	{
	    		System.out.println(i);	    		
	    	}
	    	else
	    		it.remove();
	    	
	    	System.out.println(i);
		}*/
		
		//By Using List Iterator
		
		ListIterator li=v.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.hasPrevious());
			System.out.println(li.nextIndex());
		}
		
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}
}
