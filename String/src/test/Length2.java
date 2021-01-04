package test;

import java.util.Scanner;

public class Length2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s1=sc.nextLine();
		char ch[]=s1.toCharArray();
		int count = 0;
		for(int i=0;i<ch.length;i++)
		{
			count++;
		}
		System.out.println("length = "+count);
		
	}

}
