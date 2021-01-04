package Org.Btm.Demos;

import java.util.Scanner;

public class CheckP 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The number");
		
		int n=sc.nextInt();
		int temp=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0) {
			temp =temp+1;
			}
		}
		if(temp==0)
			System.out.println("prime");
		else
			System.out.println("not");
			temp=0;
	}
	

}
