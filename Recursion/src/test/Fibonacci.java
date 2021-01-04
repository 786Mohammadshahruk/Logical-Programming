package test;

import java.util.Scanner;

public class Fibonacci 
{
	static  int fibonacci(int n)
	{
		if(n==1)
			return 0;
		if(n==2)
			return 1;
		return fibonacci(n-2)+fibonacci(n-1);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		System.out.println(fibonacci(sc.nextInt()));
		
		
	}

}
