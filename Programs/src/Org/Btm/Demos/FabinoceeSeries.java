package Org.Btm.Demos;

import java.util.Scanner;

public class FabinoceeSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The number");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		for(int i=1;i<=10;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}

}
