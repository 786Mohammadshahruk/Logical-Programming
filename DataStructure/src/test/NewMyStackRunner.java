package test;
public class NewMyStackRunner 
{
	public static void main(String[] args) 
	{
		NewMyStack nms=new NewMyStack(10);
		nms.push(10);
		nms.push(20);
		nms.push("abc");
		nms.push(20.6);
		System.out.println(nms);
		System.out.println(nms.pop());
		System.out.println(nms);
	}

}
