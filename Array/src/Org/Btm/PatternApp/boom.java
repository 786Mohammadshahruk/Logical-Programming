package Org.Btm.PatternApp;

public class boom 
{
 /*	 D
	 D C
	 D C B
	 D C B A
	 D C B
	 D C
	 D  */
public static void main(String[] args) 
{
	int n=7;
	int st=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=st;j++)
		{
			System.out.print((char)(69-j)+" ");
		}	
			if(i>n/2)
			{
				st--;
			}
			else
			{
				st++;
			}
	System.out.println();
	}
		
}	
		/*for(int i=1;i<=3;i++)
		{
			for(int j=3;j>i-1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/	
	
}
	


