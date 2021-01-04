package test;
public class My_Queue 
{
	int capacity;
	Object obj[];
	int first;
	int last;
	public My_Queue(int capacity) 
	{
		this.capacity=capacity;
		obj=new Object[capacity];
		first=0;
		last=-1;
		
	}
	public String toString()
	{
		String st="[";
		for (int i = 0; i <= last; i++)
		{
			st=st+obj[i];
			
			if(i<last)
			st=st+",";
		}
		return st+"]";
	}
	public void offer(int data)
	{
		if(last==capacity-1)
		{
			System.out.println("Queue Over flow");
			return;
		}
		obj[++last]=data;
	}
	public void pool()
	{
		if(last==-1)
		{
			System.out.println("Queue Under flow");
		}
		for(int i=0;i<last;i++)
		{
			obj[i]=obj[i+1];
		}
		last--;
	}
	public Object peek()
	{
		if(last==-1)
		{
			System.out.println("Queue Under flow");
		}
		return obj[first]; 
	}
	public int size()
	{
		return last+1;
	}
	public int capacity()
	{
		return capacity;
	}

}
