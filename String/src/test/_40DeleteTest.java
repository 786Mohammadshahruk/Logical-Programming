package test;
public class _40DeleteTest 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("Hari Ameerpet Krishna");
		StringBuffer sb1=new StringBuffer("abc");
		System.out.println(sb);
		sb.delete(5, 13);
		System.out.println(sb);
		sb.deleteCharAt(3);
		System.out.println(sb);
	//	sb.deleteCharAt(40);
		System.out.println(sb1.capacity());
		
	}

}
