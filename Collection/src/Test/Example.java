package Test;
public class Example implements Comparable
{
	int x;
	public Example()
	{
		
	}
	public Example(Example e)
	{
		
	}
	@Override
	public int compareTo(Object o) 
	{
		return 0;
	}
	public String toString()
	{
		return ""+x;
	}
}
