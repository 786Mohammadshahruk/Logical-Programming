package test;
public class _38insertTest 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("27122004");
		System.out.println(sb);
		sb.insert(2, '-');
		System.out.println(sb);
		sb.insert(5, '-');
		System.out.println(sb);
	 // sb.insert(sb.length()-1, null);
	 	sb.insert(0, "b");
		
	}

}
