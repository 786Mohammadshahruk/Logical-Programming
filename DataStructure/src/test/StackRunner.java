package test;

public class StackRunner
{
	public static void main(String[] args) 
	{
		My_Stack stk=new My_Stack(10);
		stk.push(10);
		stk.push(20);
		stk.push(null);
		stk.push("abc");
		System.out.println(stk);
		System.out.println(stk.peek());
		System.out.println(stk.pop());
		System.out.println(stk);
		System.out.println(stk.size());
		System.out.println(stk.capacity);
	}

}
