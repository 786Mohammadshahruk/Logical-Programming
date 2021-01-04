package Org.Btm.PatternApp;

import java.util.Scanner;

public class Palindro 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String  s1=sc.next();
		int l=s1.length()-1;
		boolean b=true;
		for(int i=0;i<l/2;i++)
		{
			if(s1.charAt(i)!=s1.charAt(l))
			{
				b=false;
				break;
			}
			l--;
		}
		if(b==true)
			System.out.println("Palindrom");
		else
			System.out.println("Not a Palindrom");
	}
}
