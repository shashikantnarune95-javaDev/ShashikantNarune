package string;

public class TestComparison1 {
	public static void main(String args[])
	{
		String s="java";
		String s1="java";
		String s2=new String("Java");
		String s3="Shashi";
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s2.equals(s1));
		System.out.println(s.equals(s3));
		System.out.println(s1==s2);
		System.out.println(s==s1);
				
		
	}

}
