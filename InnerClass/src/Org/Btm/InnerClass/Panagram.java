package Org.Btm.InnerClass;

import java.util.Scanner;

public class Panagram 
{
	static String removeSpace(String s)
	{
		char ch[]=s.toCharArray();
		String newString="";
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]!=' ')
			{
				newString =newString+ch[i];				
			}
		}
		return newString;
	}
	static char[] toIgnoreCase(char ch[])
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
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String string=sc.nextLine();
		String withoutSpace=removeSpace(string);
		char ch[]=withoutSpace.toCharArray();
		char small[]=toIgnoreCase(ch);
		char allAlfa[]=new char[26];
		for(int i=0;i<small.length;i++)
		{
			int x=small[i]-97;
			allAlfa[x]=1;
		}
		boolean b=true;
		for(int i=0;i<allAlfa.length;i++)
		{
			if(allAlfa[i]==0)
			{
				b=false;
			}
		}
		if(b==true)
			System.out.println("panagram");
		else
			System.out.println("not panagram");
	}

}
