package array;

public class Duplicate {
	public static void main(String args[])
	{
		int arr[]= {2,3,35,14,3,2,5,6,78};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate"+arr[j]);
				}
			}
		}
	}

}
