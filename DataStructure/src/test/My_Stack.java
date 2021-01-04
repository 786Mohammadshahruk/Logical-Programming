package test;
public class My_Stack 
{
	int capacity;
	Object obj[];
	int top;
	public My_Stack(int capacity)
	{
		this.capacity=capacity;
		obj=new Object[capacity];
		top=-1;
	}
	public void push(Object data)
	{
		if(top==capacity-1)
		{
			System.out.println("stack overflow");
			return;
		}
		obj[++top]=data;		
	}
	public String toString()
	{
		String st="[";
		for (int i = 0; i <= top; i++) 
		{
			st=st+obj[i];
			if(i<top)
			{
				st=st+",";
			}
		}
		return st=st+"]";
	}
	public Object peek()
	{
		if(top==-1)
		{
			System.out.println("stack under flow");
			return null;
		}
		return obj[top];
	}
	
	public Object pop()
	{
		if(top==-1)
		{
			System.out.println("Stack Under Flow");
			return null;
		}
		return obj[top--];
	}
	public int size()
	{
		return top+1;
	}
	public int capacity()
	{
		return capacity;
	}
}
