package Ass2;

class Time
{
	int hr;
	int min;
	int sec;
	
	

	int getHr() {
		return hr;
	}

	void setHr(int hr) {
		this.hr = hr;
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
	   System.out.println("HOUR is this time="+getHr());
	   System.out.println("Min is this time="+getMin());
	   System.out.println("SEC is this time="+getSec());
	}
	
	
}

public class Test1 {

	public static void main(String[] args) {
		
		Time t1;
		t1=new Time();
		
		t1.setHr(12);
		t1.setMin(45);
		t1.setSec(14);
		
		t1.display();
	}

}