package test;

import java.util.Scanner;

public class PrintNumber_N_to_1 
{
	static void PrintNumber(int n)
	{
		if(n>0)
		{
			PrintNumber(n-1);
			System.out.println(n);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		PrintNumber_N_to_1.PrintNumber(sc.nextInt());
		
	}

}
