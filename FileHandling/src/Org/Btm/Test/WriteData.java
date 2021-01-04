package Org.Btm.Test;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteData 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		String str="java is a programming language";
		OutputStream fout=null;
		try
		{
			fout=new FileOutputStream("C:\\Users\\mshah\\Desktop\\New folder (2)\\t1.txt");
			byte b[]=str.getBytes();
			fout.write(b);
			fout.flush();
			System.out.println("Succesfully written");
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try
			{
				fout.close();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
