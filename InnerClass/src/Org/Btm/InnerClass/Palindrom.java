package Org.Btm.InnerClass;

import java.util.Scanner;

public class Palindrom 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String string=sc.nextLine();
		int l=string.length();
		boolean b=true;
		for(int i=0;i<(l-1)/2;i++)
		{
			if(string.charAt(i)!=string.charAt(l-1))
			{
				b=false;
				break;
			}
			l--;
		}
		if(b==true)
			System.out.println("Palindrom");
		else
			System.out.println("not p");
		
	}

}
