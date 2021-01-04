package Org.Btm.PatternApp;

import java.util.Scanner;

public class Palindrom 
{
	/* public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		int a=0;
		while(n>0)
		{
			a=n%10;
			sum=(sum*10)+a;
			n=n/10;			
		}
		if(temp==sum)
			System.out.println("palindrom");
		else
			System.out.println("non p");
		
	}*/
	/*
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.next();
		StringBuffer sb=new StringBuffer(s1);
		String s2=sb.reverse().toString();
		if(s2.equals(s1))
			System.out.println("p");
		else
			System.out.println("n");
		
	}*/
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		char ch1[] = s.toCharArray();
		char ch2[] = new char[ch1.length];
		int a=ch2.length-1;
		for(int i=0;i<ch1.length;i++)
		{
			ch2[a]=ch1[i];
			a--;
		}
		boolean find=check(ch1,ch2);
		if(find)
			System.out.println("p");
		else
			System.out.println("n p");
	}
	static boolean  check(char []ch1,char []ch2)
	{
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i])
			{
				return false;
			}
		}
		return true;
	}

}
