package test;

import java.util.HashMap;
import java.util.Scanner;

public class OccrenceOfWords 
{
	private static void check() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String s1[]=str.split(" ");
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for (String temp : s1) 
		{
			if(map.get(temp)!=null)
			{
				map.put(temp,map.get(temp)+1);
			}
			else
			map.put(temp, 1);
		}
		System.out.println(map);
				
		
	}
	
	public static void main(String[] args) 
	{
		check();		
	}

	

}
