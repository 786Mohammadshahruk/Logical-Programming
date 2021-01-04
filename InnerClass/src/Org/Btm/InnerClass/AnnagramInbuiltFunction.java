package Org.Btm.InnerClass;

import java.util.Arrays;
import java.util.Scanner;

public class AnnagramInbuiltFunction 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string1");
		String s1=sc.nextLine();
		String sn1=s1.replace(" ", "");
		System.out.println("enter the string1");
		String s2=sc.nextLine();
		String sn2=s2.replace(" ","");
		String snn1=sn1.toLowerCase();
		String snn2=sn2.toLowerCase();
		char ch1[]=snn1.toCharArray();
		char ch2[]=snn2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean b=Arrays.equals(ch1, ch2);
		if(b==true)
		System.out.println("Annagram");
		else
			System.out.println("not annagram");
		
		
	}

}
