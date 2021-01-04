package test;

import java.util.Scanner;

public class PrimeNumber 
{
	static boolean Prime(int n,int i)
	{
		if(n%i==0)
			return false;
		if(i>n/2)
			return true;
		return Prime(n,i+1);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		boolean b=Prime(sc.nextInt(),2);
		if(b)
			System.out.println("prime");
		else
			System.out.println("Not prime");
		
		
	}

}
