package Org.Btm.PatternApp;

import java.util.Scanner;

public class Annagram 
{
	static char[] sort(char []c)
	{
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		return c;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.next();
		System.out.println("Enter the String");
		String s2=sc.next();
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		char []ch3=sort(ch1);
		char []ch4=sort(ch2);
		boolean b=false;
		for(int i=0;i<ch3.length;i++)
		{
			if(ch3[i]!=ch4[i])
			{
				b=true;
				break;
			}
		}
		if(b==false)
			System.out.println("Annagram");
		else
			System.out.println("not annagram");
		
		
		
	}

}
