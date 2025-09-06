package Ass1;

class Rectangle
{
	int lenght;
	int width;
	int area;
	
	void display()
	{
		area=lenght*width;
		System.out.printf("AREA OF RECTANGLE=%d",this.area);
	}
}
public class Test5 {

	public static void main(String[] args) {
		
		Rectangle r1;
		r1=new Rectangle();
		
		r1.lenght=10;
		r1.width=20;
		
		r1.display();
	}

}
