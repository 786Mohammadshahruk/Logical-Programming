package Org.Btm.PatternApp;

import java.util.Scanner;

public class InsertElement 
{
	/*static int[] insert(int[]a1)
	{
		int a2[]=new int[a1.length+1];
	}*/
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int n=sc.nextInt();
		int a1[]=new int[n];
		System.out.println("Enter the Elements");
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
		for(int i=0;i<a1.length;i++)
		{
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		System.out.println("In which index you want to insert");
		int n1=sc.nextInt();
		System.out.println("enter the element");
		int e=sc.nextInt();
		int a2[]=new int[a1.length+1];
		for(int i=0;i<a1.length;i++)
		{
				if(i<n1)
				{
					a2[i]=a1[i];
				}
				else
				{
					a2[i+1]=a1[i];
				}
			a2[n1]=e;
			
		}
		for(int i=0;i<a2.length;i++)
		{
			System.out.print(a2[i]+" ");
		}
		
	}

}
