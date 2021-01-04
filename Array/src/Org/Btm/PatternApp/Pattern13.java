package Org.Btm.PatternApp;

import java.util.Scanner;

public class Pattern13 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String a=sc.nextLine();
		char []x=a.toCharArray();
		char []y=new char[x.length];
		int i=0;
		int j=x.length-1;
		while(j>=0)
		{
			y[j]=x[i];
				i++;	
				j--;
		}
		System.out.println(y);
		boolean find=isPalindrom(x,y);
		if(find)
		{
			System.out.println("p");
		}
		else
		{
			System.out.println("np");
		}
		sc.close();
	}
	static boolean isPalindrom(char []x,char[]y)
	{
		for(int k=0;k<x.length;k++)
		{
			if(x[k]!=y[k])
			{
				return false;
			
			}
		}
	return true;
	}
}
