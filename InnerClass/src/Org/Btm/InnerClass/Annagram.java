package Org.Btm.InnerClass;

import java.util.Scanner;

public class Annagram
{
	static String removeSpace(String s)
	{
		String s1="";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				s1=s1+ch[i];
			}
		}
		return s1;
	}
	static char[] tolowercase(char[] ch)
	{
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
		}
		return ch;
	}

	static char[] sort(char []ch)
	{
		char temp;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		return ch;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String");
		String firstString=sc.nextLine();
		System.out.println("Enter the 2nd String");
		String secondString=sc.nextLine();
		String witoutSpaceString1=removeSpace(firstString);
		String witoutSpaceString2=removeSpace(secondString);
		char ch1[]=witoutSpaceString1.toCharArray();
		char ch2[]=witoutSpaceString2.toCharArray();
		char tolowecase1[]=tolowercase(ch1);
		char tolowecase2[]=tolowercase(ch2);
		char sortA[]=sort(tolowecase1);
		char sortB[]=sort(tolowecase2);
		boolean b=true;
		for(int i=0;i<sortA.length;i++)
		{
				if(sortA[i]!=sortB[i])
				{
					b=false;
					break;
				}		
		}
		if(b==true)
		{
			System.out.println("Annagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}

}
