package Org.Btm.PatternApp;
import java.util.*;
public class TRYCatch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first num");
		int x=sc.nextInt();
		while(true)
		{
		System.out.println("enter the second num");
		int y=sc.nextInt();
		
			try {
		int z=x/y;
		System.out.println(z);
		break;
	 	}catch(ArithmeticException e)
	 	{
	 		System.out.println("Second number is invalid");
	 		
	 	}
	}
}
	

}
