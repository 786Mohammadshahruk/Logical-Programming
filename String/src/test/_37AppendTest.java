package test;
public class _37AppendTest 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer();
		sb.append("a");
		sb.append(10);
		System.out.println(sb.length());
		Pqr p=new Pqr();
		sb.append(p);
		System.out.println(sb.length());
		System.out.println(sb);
		sb.append((String)null);
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append((char[])null);
	}

}
