package Test;

import java.util.Stack;

public class stackDemo 
{
	public static void main(String[] args) 
	{
		Stack st=new Stack();
		st.push(new Integer(10));
		st.push(new Integer(30));
		st.push(new Integer(15));
		st.push(new Integer(20));
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st);
		//System.out.println(st.pop());
		//System.out.println(st);
		System.out.println(st.search(new Integer(10)));
	}
}
