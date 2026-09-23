package array;

public class Grt {
	public static void main(String args[])
	{
		int arr[]= {10,12,0,1,30};
		int greater=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(greater<arr[i])
			{
				greater=arr[i];
			}
		}
		System.out.print("Greater number is="+greater);
	}

}
