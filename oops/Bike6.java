package oops;

	public class Bike6 extends Vehicle2
	{
		public void run()
		{
			System.out.println("Bike is running");
		}
		public static void main(String args[])
		{
			Vehicle2 v1=new Bike6();
			v1.run();
			Bike6 b1=new Bike6();
			b1.run();
		}
	}



