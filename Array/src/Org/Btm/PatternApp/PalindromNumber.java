package Org.Btm.PatternApp;

import java.util.Scanner;

public class PalindromNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int a,sum=0;
		int temp=n;
		while(n>0)
		{
			a=n%10;
			sum=(sum*10)+a;
			n=n/10;
		}
		if(temp==sum)
		System.out.println("Plindrom");
		else
			System.out.println("non plindrom");
		
	}

}
