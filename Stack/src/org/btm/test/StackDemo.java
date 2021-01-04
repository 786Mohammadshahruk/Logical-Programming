package org.btm.test;

import java.util.Stack;

public class StackDemo 
{
	public static void main(String[] args) 
	{
		Stack st=new Stack();
		st.push("A");
		st.push("B");
		st.push("C");
		st.push("D");
		st.push("E");
		st.push(null);
		st.push(null);
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println(st.size());
	}

}
