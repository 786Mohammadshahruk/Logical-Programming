package test;

import java.util.Scanner;

public class SumOfNumeric 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		int sum=0;
		for (int j = 0; j < ch.length; j++)
		{
			if(ch[j]>=48&&ch[j]<=57)
			{
				sum =sum+ch[j]-48;
			}
			
		}
		System.out.println(sum);
		
	}

}
