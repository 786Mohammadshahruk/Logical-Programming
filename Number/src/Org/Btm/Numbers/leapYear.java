package Org.Btm.Numbers;

import java.util.Scanner;

public class leapYear 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n%400==0||n%4==0)
		{
			if(n%100==0)
			{
				System.out.println("Not lp");
			}
			else
				System.out.println("l p");
		}
		else
			System.out.println("N L Y");
	
	}

}
