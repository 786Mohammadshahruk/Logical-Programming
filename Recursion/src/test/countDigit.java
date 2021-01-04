package test;

import java.util.Scanner;

public class countDigit 
{
	static int DigitCount(int n)
	{
		if(n<10)
		{
			return 1;
		}
		return 1+DigitCount(n/10);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		System.out.println(DigitCount(sc.nextInt()));
		
	}

}
