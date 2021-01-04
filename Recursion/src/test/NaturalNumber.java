package test;

import java.util.Scanner;

public class NaturalNumber 
{
	static int naturalNumber(int n)
	{
		if(n==0)
			return 0;
		return n+naturalNumber(n-1);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		System.out.println(naturalNumber(sc.nextInt()));
		
	}

}
