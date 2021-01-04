package Org.Btm.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Write 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		OutputStream os=new FileOutputStream("C:\\Users\\mshah\\Desktop\\Program\\fileHandling\\A.txt");
		byte b[]=str.getBytes();
		os.write(b);
		System.err.println("data inserted!!!");
		os.flush();
		
	}

}
