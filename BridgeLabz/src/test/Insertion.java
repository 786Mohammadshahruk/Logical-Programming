package test;
public class Insertion 
{
	public static void main(String[] args) 
	{
		int arr[]= {34,56,23,58,67,45,24};
		
		for(int i=1;i<arr.length;i++)
		{
			int ele=arr[i];
			int j=i-1;
			
			while(j>=0 && ele<arr[j])
			{
				arr [j+1]=arr[j];
				j--;
			}
			arr[j+1]=ele;
		}
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
		
	}

}
