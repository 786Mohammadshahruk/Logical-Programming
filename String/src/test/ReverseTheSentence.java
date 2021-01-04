package test;

import java.util.Scanner;

public class ReverseTheSentence 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
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
				s2=s2+ch[i];
			
		}
		System.out.println(s2);
		
	}

}
