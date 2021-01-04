package test;

import java.util.Scanner;

public class reverse1 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String s2= "";
		for(int i=st.length()-1;i>=0;i--)
		{
			s2=s2+st.charAt(i);			
		}
		System.out.println(s2);
		
	}

}
