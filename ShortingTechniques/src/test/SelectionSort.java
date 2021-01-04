package test;
public class SelectionSort 
{
	public static void main(String[] args) 
	{
		int arr[]= {34,56,23,58,67,45,24};
		int []z=selectionSort(arr);
		for (int i = 0; i < z.length; i++) 
		{
			System.out.print(z[i]+" ");			
		}
	}

	static int[] selectionSort(int[] arr) 
	{
		for (int i = 0; i < arr.length-1; i++)
		{
			int min=i;
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int t=arr[min];
			arr[min]=arr[i];
			arr[i]=t;
		}
		return arr;
	}

}
