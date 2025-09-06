package multithreading;

class Admin extends Thread{
	
	public void run()
	{
		String str = "axvvwebceruvrigtnbtibtmruvnybxtxyenutvnhthvimv";
		
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
}///class Admin ends here

class SalesManager implements Runnable {
	
	public void run()
	{
		String str = "!@#$%^&*(*&^%$#@!@#$%^&*()";
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
public class Employee {
    
	public static void main(String[] args) {
		
		
		Admin a1 = new Admin();
		a1.start();
		
		SalesManager s1 = new SalesManager();
		Thread t1 = new Thread(s1);
		t1.start();
		
	String str = "123456789543245678962314567897325132454675841243567684327";
		
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
