package test;

import java.util.Scanner;

public class reverceTheWordInSentence 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.nextLine();
		char ch[]=s1.toCharArray();
		String s2="";
		for(int i=0;i<ch.length;i++)
		{
			int k=i;
			while(i<ch.length&&ch[i]!=' ')
			{
				i++;				
			}
			int j=i-1;
			while(k<=j)
			{
				s2=s2+ch[j];	
				j--;
			}
			s2=s2+' ';
			
			
		}
		System.out.println(s2);
		
	}

}
