package Org.Btm.PatternApp;

import java.util.Scanner;

public class Occurence 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		String s2=s1.toLowerCase();
		int ch2[]=new int[128];
		for(int i=0;i<s2.length();i++)
		{
			ch2[s2.charAt(i)]++;
		}
		for(int i=0;i<ch2.length;i++)
		{
			if(ch2[i]>0)
	      System.out.println((char)i+" "+ch2[i]);
				//System.out.print((char)i);
		}
				
	}
 
}
