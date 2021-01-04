package test;

import java.util.HashMap;
import java.util.Scanner;

public class OccrenceOfWordInString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		check(str);
		
	}

	private static void check(String str) 
	{
		String s[]= str.split(" ");
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		for (String tempstring : s) 
		{
			if(hm.get(tempstring)!=null)
			{
				hm.put(tempstring, hm.get(tempstring)+1);
			}
			else
			hm.put(tempstring, 1);
			
		}		
		System.out.println(hm);
	}

}
