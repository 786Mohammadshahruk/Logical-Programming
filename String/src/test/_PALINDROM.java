package test;

import java.util.Scanner;

public class _PALINDROM 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		boolean b=true;
		char ch[]=s.toCharArray();
		int n=ch.length-1;
		for(int i=0;i<=n/2;i++)
		{
			if(ch[i]!=ch[n])
			{
				b=false;
				System.out.println(i);
				n--;
				break;
			}
		}
		if(b)
			System.out.println("Palindrom");
		else
			System.out.println("Non palindrom");
		
	}

}
