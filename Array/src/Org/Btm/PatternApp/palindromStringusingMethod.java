package Org.Btm.PatternApp;

import java.util.Scanner;

public class palindromStringusingMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.next();
		StringBuffer sb=new StringBuffer(s1);
		String s2=sb.reverse().toString();
		if(s2.equals(s1))
		{
			System.out.println("Plindrom = "+s2);
		}
		else
			System.out.println("not palindrom = "+s2);
		
	}

}
