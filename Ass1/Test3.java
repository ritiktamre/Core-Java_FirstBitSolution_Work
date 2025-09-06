package Ass1;


class Distance
{
	int feet;
	int inch;
	
	void display()
	{
		System.out.printf("FEET=%d INCH=%d",this.feet,this.inch);
	}
}

public class Test3 {

	public static void main(String[] args) {
		Distance d1;
		d1=new Distance();
		
		d1.feet=10;
		d1.inch=12;
		
		d1.display();
		
		

	}

}
