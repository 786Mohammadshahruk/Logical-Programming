package Org.Btm.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Read 
{
	public static void main(String[] args) throws Exception 
	{
		InputStream fis=new FileInputStream("C:\\Users\\mshah\\Desktop\\Program\\fileHandling\\A.txt");
		int i=fis.read();
		while(i!=-1)
		{
			Thread.sleep(100);
			System.out.print((char)i);
			i=fis.read();
		}
		
	}

}
