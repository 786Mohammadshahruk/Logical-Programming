package Org.Btm.PatternApp;

import java.util.Scanner;

public class REverse_The_Words 
{
	static String Reverse(String s1)
	{
		char ch[]=s1.toCharArray();
		String s2="";
		for(int i=ch.length-1;i>=0;i--)
		{
			int j=i;
			while(i>=0&&ch[i]!=' ')
			{
				i--;
			}
			int k=i+1;
			while(k<=j)
			{
				s2=s2+ch[k];
				k++;
			}
			if(i>=0)
			{
				s2=s2+ch[i];
			}
		}
		return s2;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		String s2=Reverse(s1);
		System.out.println(s2);
	}

}
