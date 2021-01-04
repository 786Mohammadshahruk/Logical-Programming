package Org.Btm.Demos;

import java.util.Scanner;

public class Palindrom_Method 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The String");
		String n=sc.next();
		StringBuffer sb=new StringBuffer(n);
		String s=sb.reverse().toString();
		if(s.equals(n))
			System.out.println("p");
		else
			System.out.println("non palindrom");
		
	}
	

}
