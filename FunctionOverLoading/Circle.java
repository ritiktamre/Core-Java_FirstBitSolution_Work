package FunctionOverLoading;

class circle1
{
	void area(int radius)
	{
	  int area=radius;
	  System.out.println("CIRCLE OF RADIUS="+area);
	}
}

public class Circle {

	public static void main(String[] args) {
		
		circle1 c1;
		c1=new circle1();
		
		int radius=20;
		c1.area(radius);
		

	}

}
