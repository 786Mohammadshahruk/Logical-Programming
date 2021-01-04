package Org.Btm.Demos;

import java.util.Scanner;

public class PalindromString 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The number");
		String s=sc.next();
		char []ch=s.toCharArray();
		char []c1=new char[ch.length];
		int j=ch.length-1;
		for(int i=0;i<ch.length;i++)
		{
			c1[j]=ch[i];
			j--;
		}
		boolean b=check(ch,c1);
		if(b)
			System.out.println("p");
		else
			System.out.println("n");
				
	}
	static boolean check(char []ch,char []c1)
	{
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=c1[i])
			{
				return false;
			}
				
		}
		return true;
	}

}
