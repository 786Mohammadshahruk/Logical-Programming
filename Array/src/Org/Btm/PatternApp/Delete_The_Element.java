package Org.Btm.PatternApp;

import java.util.Scanner;

public class Delete_The_Element 
{
	static int[] remove(int a[] )
	{
		int i,j=0; int n=a.length;
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					for(int k=j;k<n-1;k++)
					{
						a[k]=a[k+1];
					}
					i--;
					n--;
				}
			}
		
		}
		return a;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int a[] =new int[n]; 
		System.out.println("enter the numbers");
		for(int i=0;i<a.length;i++)
		{
			 a[i]=sc.nextInt();
		}
		int []b=remove(a);
		for(int i=0;i<b.length;i++)
		{
		System.out.print(b[i]);
		}
	}

}
