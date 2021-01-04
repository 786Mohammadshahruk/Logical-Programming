package test;

import java.util.Scanner;

public class CountCharacterInWord 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		char ch[]=s1.toCharArray();
		int count=0;
		String s2="";
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]!=' ')
			{
				count++;
				s2=s2+ch[i];
			}
			else if(ch[i]==' ')
			{
				s2=s2+"---->"+count;
				count=0;
			}
			
		}
		s2=s2+"---->"+count;
		System.out.println(s2);
		
	}

}
