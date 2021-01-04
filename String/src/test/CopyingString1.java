package test;

import java.util.Scanner;

public class CopyingString1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		char ch1[]=s1.toCharArray();
		char ch2[]=new char[ch1.length];
		for(int i=0;i<ch1.length;i++)
		{
			ch2[i]=ch1[i];			
		}
		System.out.println(ch1);
		System.out.println(ch2);
	}

}
