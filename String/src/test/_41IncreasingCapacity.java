package test;
public class _41IncreasingCapacity 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<=17;i++)
		{
			sb.append(i);
		}
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
	}

}
