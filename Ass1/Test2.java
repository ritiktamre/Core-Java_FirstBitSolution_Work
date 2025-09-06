package Ass1;


class Time
{
	int hour;
	int min;
	int sec;
	
   void display()
   {
	   System.out.printf("%d:%d:%d",this.hour,this.min,this.sec);
   }
}

public class Test2 {

	public static void main(String[] args) {
		
		Time t1;
		t1=new Time();
		
		t1.hour=3;
		t1.min=15;
		t1.sec=34;
		
		t1.display();

	}

}

