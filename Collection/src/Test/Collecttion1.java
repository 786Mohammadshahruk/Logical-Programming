package Test;
import java.util.ArrayList;
import java.util.Iterator;
public class Collecttion1 
{
	public static void main(String[] args) 
	{
		
		ArrayList<Integer> al2=new ArrayList();
		al2.add(1);
		al2.add(2);
		al2.add(3);
		al2.add(4);
		Iterator<Integer> it= al2.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}
}
