package test;

import java.util.Scanner;

public class reverceString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		char ch[]=s1.toCharArray();
		int l=ch.length;
		for(int i=0;i<l/2;i++)
		{
			char c=ch[i];
			ch[i]=ch[l-1-i];
			ch[l-1-i]=c;
		}
		System.out.println(ch);
		
	}

}
