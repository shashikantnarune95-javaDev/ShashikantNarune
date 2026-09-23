package array;

public class Simple {
	 public static void main(String args[])
	 { 
		 int A[][]= {{1,2},{3,4}};
		 int B[][]= {{1,1},{1,1}};
		 int c[][]=new int[2][2];
		
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<B.length;j++)
			{
				for(int k=0;k<2;k++)
				{
					c[i][j]=c[i][j]+A[i][k]*B[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
		}
	 }
		 
		   } 


