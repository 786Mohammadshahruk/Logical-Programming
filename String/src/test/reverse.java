package test;
import java.util.Scanner;
public class reverse 
{

		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String");
			String s1=sc.nextLine();
			char ch1[]=s1.toCharArray();
			int x=ch1.length-1;
			char ch2[]=new char[ch1.length];
			for(int i=0;i<ch2.length;i++)
			{
				ch2[i]=ch1[x--];			
			}
			System.out.println(ch1);
			System.out.println(ch2);
		}


}
