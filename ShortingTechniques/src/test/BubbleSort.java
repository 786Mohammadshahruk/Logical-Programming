package test;
public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int arr[]= {34,56,23,58,67,45,24};
		int z[]=bubbleSort(arr);
		for (int i = 0; i < z.length; i++) 
		{
			System.out.print(z[i]+" ");			
		}
		
	}

	static int[] bubbleSort(int[] arr) 
	{
		for (int i = 0; i < arr.length-1; i++)
		{
			for (int j = 0; j < arr.length-1-i; j++) 
			{
				if (arr[j]>arr[j+1])
				{
					int t=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=t;
										
				}
				
			}
			
		}
		return arr;
	}

}
