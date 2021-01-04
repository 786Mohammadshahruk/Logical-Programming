package Org.Btm.InnerClass;

import java.util.Scanner;

public class NoOfOccurenceOfCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		int c[]=new int[128];
		for(int i=0;i<str.length();i++)
		{
			c[str.charAt(i)]++;
		}
		for (int i = 0; i < c.length; i++) 
		{
			if(c[i]>1)
			System.out.print((char)i+" ");
			
		}
		
	}

}
