package FunctionOverLoading;

class Calculator1
{
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("INT SUM="+c);
	}
	void add(double a,double b)
	{
		double c=a+b;
		System.out.println("DOUBLE SUM="+c);
	}
	void add(int a,double b)
	{
		double c=a+b;
		System.out.println("INT & DOUBLE SUM="+c);
	}
	void add(double a,int b)
	{
		double c=a+b;
		System.out.println("DOUBLE & INT SUM="+c);
	}
}

public class AddCalc {

	public static void main(String[] args) {
		
		Calculator1 c1;
		c1=new Calculator1();
		int a=10,b=20;
		c1.add(a,b);
		
		double a1=23.4,b1=22.4;
		c1.add(a1,b1);
		
		int a3=10;
		double b3=23.6;
		c1.add(a3,b3);
		
		double a4=12.3;
		int b4=23;
		c1.add(a4,b4);
		
	}

}
