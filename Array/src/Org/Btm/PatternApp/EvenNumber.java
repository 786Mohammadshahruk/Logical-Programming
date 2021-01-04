package Org.Btm.PatternApp;

import java.util.Scanner;

public class EvenNumber 
{
	static int check(int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many You want to enter");
		int n=sc.nextInt();
		int a[]=new int[n]; 
		System.out.println("Enter the numbers");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int x=check(a);
		System.out.println("total "+x+" numbers are even in this Array");
	}
}
