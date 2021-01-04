package Org.Btm.InnerClass;

import java.util.Scanner;

public class ReverseTheString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		int l=ch.length;
		for(int i=0;i<l;i++)
		{
			char temp=ch[i];
			ch[i]=ch[l-1];
			ch[l-1]=temp;
			l--;
			
		}
		System.out.println(ch);
	}

}
