 package Org.Btm.PatternApp;

import java.util.Scanner;

public class palindromString {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String a=sc.next();
		String b;
		StringBuffer sb=new StringBuffer(a);
		//System.out.println(sb);
		//System.out.println(sb.hashCode());
		b=sb.reverse().toString();
		//System.out.println(b.hashCode());
		System.out.println(b);
		if(a.equals(b))
		{
			System.out.println("p");
		}
		else
		{
			System.out.println("np");
		}
	}

}