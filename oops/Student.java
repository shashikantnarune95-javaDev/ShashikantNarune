package oops;

public class Student {
	private int rollNo;
	private String name;
	public void setRollNo(int rollNo)
	{
		this.rollNo=rollNo;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getRollNo()
	{
		return this.rollNo;
	}
	public String getName()
	{
		return this.name;
	}
	/*public static void main(String args[])
	{
		Student s1=new Student();
		s1.setName("Shashi");
		s1.setRollNo(123);
		Student s2=new Student();
		s2.setName("dfg");
		s2.setRollNo(134);
		System.out.println("name="+s1.getName());
		System.out.println("Roll="+s1.getRollNo());
		System.out.println("name="+s2.getName());
		
	}*/

}
