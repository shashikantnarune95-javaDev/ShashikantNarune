package oops;

public class Ab {
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

}
