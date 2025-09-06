package Constractor;

class Distance
{
	int feet;
	int inch;
	
	Distance()
	{
		this.feet=20;
		this.inch=24;
	}

	int getFeet() {
		return feet;
	}

	void setFeet(int feet) {
		this.feet = feet;
	}

	int getInch() {
		return inch;
	}

	void setInch(int inch) {
		this.inch = inch;
	}
	
	void display()
	{
		System.out.println("FEET="+getFeet());
		System.out.println("INCH="+getInch());
	}
}

public class Test8 {

	public static void main(String[] args) {
		
		Distance d1;
		d1=new Distance();
		
		d1.display();

	}

}
