package FunctionOverLoading;

class Shape
{
	void tringlearea(int base,int height)
	{
		double c=0.5*base*height;
		System.out.println("AREA OF TRINGLE="+c);
	}
	
	void rectanglearea(int lenght,int breadth)
	{
		int c=lenght*breadth;
		System.out.println("AREA OF RECTANGLE="+c);
	}
	
	void circlearea(int radius)
	{
		double pi=3.14;
		double c=pi*radius*radius;
		
		System.out.println("AREA OF CIRCLE="+c);
	}
}

public class Que2 {

	public static void main(String[] args) {
		Shape s1;
		s1=new Shape();
		
		int a=10,b=20;
		s1.tringlearea(a,b);
		
		int a1=17,b1=12;
		s1.rectanglearea(a1,b1);
		
		int a2=12;
		s1.circlearea(a2);

	}

}
