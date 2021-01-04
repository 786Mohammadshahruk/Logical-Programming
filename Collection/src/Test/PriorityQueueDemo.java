package Test;

import java.util.PriorityQueue;

public class PriorityQueueDemo 
{
	public static void main(String[] args) 
	{
		PriorityQueue p=new PriorityQueue();
		p.offer('z');
		p.offer('f');
		p.offer('l');
		p.offer('q');
		p.offer('s');
		p.offer('z');
		p.offer('s');
		/*for(int i=0;i<=10;i++)
		{
			p.offer(i);
		}*/
		System.out.println(p);
		System.out.println(p.poll());
		
	}
}
