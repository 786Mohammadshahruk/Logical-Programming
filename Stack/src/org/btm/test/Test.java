package org.btm.test;
public class Test 
{
	public static void main(String[] args) 
	{
		OwnStack ow = new OwnStack();
		ow.push(12);
		ow.push(11);
		ow.push(15);
		ow.push(17);
		ow.push(20);
		ow.show();
		ow.pop();
	}
}
