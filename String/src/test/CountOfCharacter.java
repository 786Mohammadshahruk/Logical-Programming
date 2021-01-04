package test;

import java.util.Scanner;

public class CountOfCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		char ch[]=s1.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>=65&&ch[i]<=90||ch[i]>=97&&ch[i]<=122)
			{
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
