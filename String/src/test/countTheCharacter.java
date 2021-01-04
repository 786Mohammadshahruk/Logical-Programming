package test;

import java.util.Scanner;

public class countTheCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		int x[]=new int[128];
		for(int i=0;i<str.length();i++)
		{
			x[str.charAt(i)]++;
		}
		for (int i = 0; i < x.length; i++)
		{
			if(x[i]!=0)
			{
				System.out.println((char)i+"--->"+x[i]);
			}
			
		}
		
	}
}
