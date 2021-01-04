package Org.Btm.PatternApp;

import java.util.Scanner;

public class SumOfNumberInAlpthNumericString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		char ch[]=s1.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=48&&ch[i]<=57)
			{
				sum=sum+(ch[i]-48);
			}
		}
		System.out.println(sum);
		System.out.println();
	}

}
