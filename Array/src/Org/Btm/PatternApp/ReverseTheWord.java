package Org.Btm.PatternApp;

public class ReverseTheWord 
{
	public static void main(String[] args) 
	{
		String s1="I Am Shahruk";
		String s2=reverse(s1);
		System.out.println(s2);
	}
		static String reverse(String s1)
		{
		char ch[]=s1.toCharArray();
		int l=ch.length-1;
		String s2="";
		for(int i=l;i>=0;i--)
		{
			int j=i;
			while(i>=0&&ch[i]!=' ')
			{
				i--;
				
			}
			int k=i+1;
			while(k<=j)
			{
				s2=s2+ch[k];
				k++;
			}
			if(i>=0)
				s2=s2+ch[i];
			
		}
		return s2;
		
	}

}
