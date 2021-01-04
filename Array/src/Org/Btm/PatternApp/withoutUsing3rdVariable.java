package Org.Btm.PatternApp;

import java.util.Scanner;

public class withoutUsing3rdVariable 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number a= ");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number b= ");
		int n2 = sc.nextInt();
		if(n1>n2) 
		{
			n1=n1+n2;
			n2=n1-n2;
			n1=n1-n2;
		}
		else if(n1==n2)
		{
			System.out.println("both number are same we can not swap");
			return;
		}
		else
		{
			 n1=n2-n1;
			 n2=n2-n1;
			 n1=n1+n2;
		}
		System.out.println("Swap number a= "+n1+" b= "+n2);
		
		
	}

}
