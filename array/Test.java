package array;

public class Test {
	public static void main(String[] args) {
		
	
	for(int i=1;i<=20;i++)
	{
	   if(i%15==0)
	   {
		   System.out.println("usbdevice");
	   }
        
	   else if(i%3==0)
		{
			System.out.println("usb");
		}
		else if(i%5==0)
		{
			System.out.println("device");
			
		}
		else {
			System.out.println(i);
		}
		
	}

	}
}