package multithreading;

class Ritik extends Thread
{
	public void run()
	{
	String str="abvxgdvwiuewbvercyubxibvrruebiwbbvyvcrybebc";
		
		for(int i=0;i<str.length();i++)
		{
			System.out.print(" "+str.charAt(i));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}//class Ritik ends here

class AnotherRitik implements Runnable 
{
	public void run()
	{
	String str="!@#$%^&*((((((((())(*&^%$#$%^%$#$%^&+_+_+_#$%^";
		
		for(int i=0;i<str.length();i++)
		{
			System.out.print(" "+str.charAt(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Radhe {

	public static void main(String[] args) {
	
		Ritik r1 = new Ritik();
		r1.start();
		
		AnotherRitik ar = new AnotherRitik();
		Thread t1 = new Thread(ar);
		t1.start();
		
		String str="12345678909876543211234567456774848";
		
		for(int i=0;i<str.length();i++)
		{
			System.out.print(" "+str.charAt(i));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
