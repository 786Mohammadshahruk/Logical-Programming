package Org.Btm.PatternApp;

import java.util.Scanner;

public class StringPalindrom 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		String s1=s.toLowerCase();
		int l=s1.length()-1;
		boolean b=true;
		for(int i=0;i<l/2;i++)
		{
			if(s1.charAt(i)!=s1.charAt(l))
			{
				b=false;
			}
			l--;
		}
		if(b==true)
			System.out.println("palindrom");
		else
			System.out.println("not a palindrom");
		
	}

}
