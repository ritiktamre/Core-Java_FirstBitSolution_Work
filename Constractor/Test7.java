package Constractor;

class Time
{
	int hour;
	int min;
	int sec;
	
	Time()
	{
		this.hour=3;
		this.min=24;
		this.sec=45;
	}

	int getHour() {
		return hour;
	}

	void setHour(int hour) {
		this.hour = hour;
	}

	int getMin() {
		return min;
	}

	void setMin(int min) {
		this.min = min;
	}

	int getSec() {
		return sec;
	}

	void setSec(int sec) {
		this.sec = sec;
	}
	
	void display()
	{
		System.out.println("HOUR="+getHour());
		System.out.println("MIN="+getMin());
		System.out.println("SEC="+getSec());
	}
	
}

public class Test7 {

	public static void main(String[] args) {
		
		Time t1;
		t1=new Time();
		
		t1.display();

	}

}
