package Org.Btm.Demos;

import java.util.Scanner;

public class Palindrom 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The number");
		int n=sc.nextInt();
		int temp=n;
		int a=0;
		int sum=0;
		while(n>0)
		{
			a=n%10;
			sum=(sum*10)+a;
			n=n/10;
			
		}
		if(sum==temp)
		{
			System.out.println("P");
		}
		else
			System.out.println("N P");
	}

}
