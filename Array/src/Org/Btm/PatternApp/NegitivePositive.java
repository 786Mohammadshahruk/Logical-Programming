package Org.Btm.PatternApp;

import java.util.Scanner;

public class NegitivePositive 
{
	static int[] check(int a[])
	{
		int count[]= new int[2];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=0)
				count[0]++;
			else 
				count[1]++;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Enter the numbers");
		int a[] = new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int[] b=check(a);
		System.out.println("possitive: "+b[0]);
		System.out.println("Negitive:  "+b[1]);
		
	}
}
