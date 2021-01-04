package Org.Btm.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteDataintoFile 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		OutputStream fout=new FileOutputStream("C:\\Users\\mshah\\Desktop\\Program\\A.txt");
		byte[] b=str.getBytes();
//		System.out.println(b[0]);
//		System.out.println(b[1]);
		fout.write(b);
		System.out.println("String insert");
		
	}

}
