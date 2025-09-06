package ParameterizedConstractor;

class Time
{
	int hour;
	int min;
	int sec;
	
	Time(int hour,int min,int sec)
	{
		this.hour=hour;
		this.min=min;
		this.sec=sec;
	}
	
	Time()
	{
		this.hour=6;
		this.min=34;
		this.sec=24;
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
