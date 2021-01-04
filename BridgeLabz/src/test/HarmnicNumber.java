package test;

import java.util.Scanner;

public class HarmnicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		double harmonic=0;
		if(n>0)
		{
			for(int i=1;i<=n;i++)
			{
				harmonic=harmonic+(float)1/i;
			}
			System.out.println(harmonic);
		}
		else
			System.out.println("-ve number is not allowed");
		
	}

}
