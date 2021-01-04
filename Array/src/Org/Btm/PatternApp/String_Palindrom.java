package Org.Btm.PatternApp;

import java.util.Scanner;

public class String_Palindrom 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.next();
		char ch[]=s1.toCharArray();
		char ch1[]=new char[ch.length];
		int j=ch.length-1;
		for(int i=0;i<ch.length;i++)
		{
			ch1[j]=ch[i];
			j--;			
		}
		boolean find=check(ch,ch1);
		if(find)
			System.out.println("palindrom");
		else
			System.out.println("non palindrom");
	}
	 static boolean check(char ch[],char ch1[])
	{
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]!=ch1[i])
				{
					return false;
				}
				
			}
			return true;
	}
}

