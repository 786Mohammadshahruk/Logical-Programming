package test;
public class InsertionSort 
{
	public static void main(String[] args) 
	{
		int a[]= {34,56,23,58,67,45,24};
		int a1[]=insertionSort(a);
		for(int i=0;i<a1.length;i++)
			System.out.print(a1[i]+" ");
	}

	private static int[] insertionSort(int[] a) 
	{
		for(int i=1;i<a.length;i++)
		{
			int ele=a[i];
			int j=i-1;
			
			while(j>=0 && ele<a[j]) 
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=ele;
		}
		return a;
	}

}
