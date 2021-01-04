package Org.Btm.PatternApp;

import java.util.Scanner;

public class NumberOfCharacterInEachWord 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		int count=0;
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' ')
			{
				s2=s2+count;
				count=0;
			}
			else
			{
				count++;
				s2=s2+s1.charAt(i);
			}
				
		}
		s2=s2+count;
		System.out.println(s2);
		
	}

}
