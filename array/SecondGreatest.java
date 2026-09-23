package array;

public class SecondGreatest {
	public static void main(String args[])
	{
		int temp;
		int arr[]= {2,3,1,5,6,3,4,8,10,23};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			
		}
		System.out.print(arr[0]);
		
	}


}
