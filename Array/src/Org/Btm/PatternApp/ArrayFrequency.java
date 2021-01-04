package Org.Btm.PatternApp;
public class ArrayFrequency 
{
	public static void main(String[] args) 
	{
		int a[]= {4,7,2,9,4,7,9};
		int a1[]=new int[10];
		for(int i=0;i<a.length;i++)
		{
			int x=10-a[i];
			int y=10-x;
			a1[y]++;			
		}
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]>0)
			{
				System.out.println(i+"----->"+a1[i]);
			}
		}
		
	}

}
