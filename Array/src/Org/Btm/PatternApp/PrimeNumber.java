package Org.Btm.PatternApp;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			System.out.println(i);
			else
				temp=0;
				
		}
	}

}
