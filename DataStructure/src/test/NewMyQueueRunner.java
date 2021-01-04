package test;
public class NewMyQueueRunner 
{
	public static void main(String[] args) 
	{
		NewMyQueue nmq=new NewMyQueue(10);
		nmq.push(11);	
		nmq.push(null);
		nmq.push("Abc");
		nmq.push(10.2);
		System.out.println(nmq);
		System.out.println(nmq.pop());
		System.out.println(nmq);
		System.out.println(nmq.pop());
		System.out.println(nmq);
		System.out.println(nmq.pop());
		System.out.println(nmq.pop());
		System.out.println(nmq);
		
	}

}
