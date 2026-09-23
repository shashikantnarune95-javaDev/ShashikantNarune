package oops;

public class RbiBank {
	public float getInterestRate()
	{
		return 4.5f;
	}
}
	class Sbi extends RbiBank
	{
		public void display()
		{
			System.out.println("SBI Bank");
		}
	}
	class Hdfc extends RbiBank
	{
		public long getloan()
		{
			return 10000l;
		}
	}
	/*class A
	{
		public static void main(String args[])
		{
			Sbi sb=new Sbi();
			sb.display();
			System.out.println(sb.getInterestRate());
			Hdfc hd=new Hdfc();
			hd.getloan();
			float r=hd.getInterestRate();
			System.out.println(r);
		}
	}*/


