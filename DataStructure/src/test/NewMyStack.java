package test;
public class NewMyStack 
{
	int capacity;
	Object obj[];
	int top;
	public NewMyStack(int capacity) 
	{
		this.capacity=capacity;
		obj= new Object[capacity];
		top=-1;		
	}
	public void push(Object data)
	{
		if(capacity==-1)
		{
			System.out.println("Stack overflow");
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
				st=st+',';
		}
		return st+"]";
	}
	public Object pop()
	{
		if(top==-1)
		{
			System.out.println("Stack under flow");
			return null;			
		}
		return obj[top--];
	}

}
