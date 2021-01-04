package Org.Btm.Numbers;

import java.util.Scanner;

public class NumberPositiveInteger
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n<0)
			System.out.println("-ve Number");
		else
			System.out.println("+ve");
	}

}
