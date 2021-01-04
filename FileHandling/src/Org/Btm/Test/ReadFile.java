package Org.Btm.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadFile 
{
	public static void main(String[] args) throws Exception 
	{
		InputStream ip=new FileInputStream("C:\\Users\\mshah\\Desktop\\Program\\InnerClass\\AnonamusInnerClass.java");
		int i=ip.read();
	//  System.out.println(ip.read());
		while(i!=-1)
		{
			Thread.sleep(100);
			System.err.print((char)i);
			i=ip.read();
		}
	}

}
