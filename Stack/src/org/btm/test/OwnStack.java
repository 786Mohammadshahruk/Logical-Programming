package org.btm.test;

import java.util.Scanner;

public class OwnStack 
{
	static int OwnStack[]=new int[5];
	static int i=0;
	static void push(int data)
	{
		OwnStack[i]=data;
		i++;
	}
	static void show()
	{
		for(int i=OwnStack.length-1;i>=0;i--)
		System.out.println(OwnStack[i]);
	}
	static void pop()
	{
		for(int i=OwnStack.length-1;i>=0;i--)
		{
			OwnStack[OwnStack.length-1]=OwnStack[i-1];
			i++;
		}
	}

}
