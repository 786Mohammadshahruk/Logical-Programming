package Org.Btm.InnerClass;

import java.util.Scanner;

public class ReverseInbuiltFunction 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer(str);
		String s=sb.reverse().toString();
		System.out.println(s);
	}

}
