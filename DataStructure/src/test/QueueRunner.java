package test;
public class QueueRunner 
{
	public static void main(String[] args) 
	{
		My_Queue qye=new My_Queue(10);	
		qye.offer(10);
		qye.offer(20);
		qye.offer(30);
		qye.offer(40);
		System.out.println(qye);
	//	System.out.println(qye.peek());
	//	System.out.println(qye);
		qye.pool();
		qye.pool();
		System.out.println(qye);
		qye.pool();
		qye.pool();
		System.out.println(qye);
	//	System.out.println(qye.size());
	//	System.out.println(qye.capacity);
		
	}

}
