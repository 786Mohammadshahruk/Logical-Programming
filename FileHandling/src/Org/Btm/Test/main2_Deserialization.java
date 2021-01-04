package Org.Btm.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class main2_Deserialization 
{
	public static void main(String[] args) throws Exception
	{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\mshah\\Desktop\\Program\\Student_Info.txt"));
		Student s=(Student)ois.readObject();
		System.out.println(s.id+","+s.name+","+s.perc);
		
	}

}
