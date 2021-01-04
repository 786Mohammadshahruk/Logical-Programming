package Org.Btm.Test;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class main1 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student ID,Name And Percentage");
		Student student = new Student(sc.nextInt(), sc.next(), sc.nextDouble());
		System.out.println("Students Information");
		System.out.println(student.id+" "+student.name+" "+student.perc);
		FileOutputStream fis=new FileOutputStream("C:\\Users\\mshah\\Desktop\\Program\\Student_Info.txt");
		ObjectOutputStream obj=new ObjectOutputStream(fis);
		obj.writeObject(student);
		obj.flush();
		fis.flush();
		obj.close();
		fis.close();
		
	}

}
