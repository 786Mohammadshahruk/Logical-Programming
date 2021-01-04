package Org.Btm.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyOneFileToAnotherFile 
{
	public static void main(String[] args) throws Exception 
	{
		InputStream is=new FileInputStream("C:\\Users\\mshah\\Desktop\\Program\\Arrays\\BubbleSort.java");
		OutputStream op=new FileOutputStream("C:\\Users\\mshah\\Desktop\\Program\\B.java");
		int i=is.read();
		while(i!=-1)
		{
			System.err.print((char)i);
			op.write(i);
			i=is.read();
			
		}
	}

}
