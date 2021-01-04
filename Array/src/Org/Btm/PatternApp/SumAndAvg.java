package Org.Btm.PatternApp;

import java.util.Scanner;

public class SumAndAvg 
{
	static int sum(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];			
		}
		return sum;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in );
		System.out.println("How many number");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the numbers");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int x=sum(a);
		System.out.println("Sum: "+x);		
			double avg=x/n;
			System.out.println("Average: "+avg);
	}
}
