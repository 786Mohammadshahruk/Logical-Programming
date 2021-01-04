package test;

import java.util.Scanner;

public class Print_1_to_N 
{
	static void PrintNumber(int n)
	{
		System.out.println(n);
		if(n>0)
		{
			PrintNumber(n-1);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		Print_1_to_N.PrintNumber(sc.nextInt());
		
	}


}
