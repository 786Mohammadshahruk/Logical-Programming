package test;

import java.util.Scanner;

public class WithoutUsingForLoop 
{
	static void Print(int x)
	{
		if(x<=10)
		{
			System.out.println(x);
		}
		Print(x+1);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		Print(n);	
		
	}

}
