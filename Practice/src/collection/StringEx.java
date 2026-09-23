package collection;

public class StringEx {
	public static void main(String args[])
	{
		String reverese;
	String rev=" ";
		String str="Hello how are you?";
		String sub=str.substring(6, 9);
		for(int i=sub.length()-1;i>=0;i--)
		{
			rev=rev+sub.charAt(i);
		}
		
		 reverese=str.replace("how", rev);
		 System.out.println(reverese);
	}
}
