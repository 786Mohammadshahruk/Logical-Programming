package test;
public class NewMyQueue 
{
	int capacity;
	Object obj[];
	int front;
	int rare;
	public NewMyQueue(int capacity) 
	{
		this.capacity=capacity;
		obj=new Object[capacity];
		front=rare=-1;
	}
	public void push(Object data)
	{
		if(rare==capacity-1)
		{
			System.out.println("Queue is full");
		}
		if(front==-1)
			front=0;
		obj[++rare]=data;
	}
	public String toString()
	{
		String st="[";
		for(int i=0;i<=rare;i++)
		{
			st=st+obj[i];
			if(i<rare)
				st=st+',';
		}
		return st+"]";
	}
	public Object pop()
	{
		if(front==-1)
		{
			System.out.println("Queue is empty");
			return null;
		}
		Object data=obj[front];
		for(int i=front;i<=rare;i++)
		{
			obj[i]=obj[i+1];
		}
		rare--;
		return data;
		
	}
	

}
