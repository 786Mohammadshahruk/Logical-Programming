package test;

import java.util.Scanner;

public class CountPrimeNumber 
{
	public static void main(String[] args) 
	{
		int count =0;
		int arr[]= {7,8,6,5,2,3,11};
		int a=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=2;j<=arr[i]-1;j++)
			{
				if(arr[i]%j==0)
				{
					count++;
					continue;
				}

			}
			if(count==0)
				a++;
		}
		System.out.println(a);
	}

}
