package Org.Btm.PatternApp;

import java.util.Scanner;

public class reverse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String s1="";
		char ch[]=str.toCharArray();
		int l=ch.length-1;
		for(int i=l;i>=0;i--)
		{
			int j=i;
			while(i>=0&&ch[i]!=' ')
			{
				i--;
			}
			int k=i+1;
			while(k<=j)
			{
				s1=s1+ch[k];
				k++;
			}
			if(i>0)
			{
				s1=s1+ch[i];
			}
		}
		System.out.println(s1);
	}
}
