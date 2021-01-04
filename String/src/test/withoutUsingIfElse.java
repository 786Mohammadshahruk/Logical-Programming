package test;

import java.util.Scanner;

public class withoutUsingIfElse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int big=(a>b && a>c)?a:((b>c)?b:c);
		int small=(a<b)?a:b;
		System.out.println(big);
		System.out.println(small);
		
	}

}
