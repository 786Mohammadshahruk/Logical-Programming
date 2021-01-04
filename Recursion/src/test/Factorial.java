package test;

import java.util.Scanner;

public class Factorial 
{
	static int findFactorial(int n)
	{
		int fact=1;
		if(n>0)
		fact=n*findFactorial(n-1);
		
		return fact;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=Factorial.findFactorial(sc.nextInt());
		System.out.println(n);
	}

}
