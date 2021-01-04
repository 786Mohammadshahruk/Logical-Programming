package test;

import java.util.Scanner;

public class Palindrom 
{
	static String space(String s1)
	{
		char ch1[]=s1.toCharArray();
		String s2="";
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=' ')
			{
				s2=s2+ch1[i];
			}
		}
		return s2;
	}
	public static void main(String[] args) 
	{		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		String s2=Palindrom.space(s1);
		int x=s2.length()-1;
		boolean b=true;
		for(int i=0;i<=x/2;i++)
		{
			if(s2.charAt(i)!=s2.charAt(x))
			{
				b=false;
				break;
			}
			x--;
		}
		if(b)
			System.out.println("palindrom");
		else
			System.out.println("not a palindrom");		
		
	}

}
