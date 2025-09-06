package multithreading;

 class Worker extends Thread{
	
	 public void run()
	 {
		 String str="12345678909876543211234567";
		 
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
}//class worker ends here
 
 class AnotherWorker implements Runnable {
	 public void run()
	 {
		 String str="!@#$%^&*()_++_)((*&^%$#@!";
		 
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
	 
public class MainThread {

	public static void main(String[] args) {
		
		Worker w1 = new Worker();
		w1.start();
		
		AnotherWorker aw = new AnotherWorker();
		Thread t1 = new Thread(aw);
		t1.start();
		
		String str="abcdefghijklmnopqrstuvwxyz";
		 
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
 