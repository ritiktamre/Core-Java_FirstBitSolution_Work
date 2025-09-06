package FunctionOverLoading;

class Calculator3
{
	void mul(int a,int b)
	{
		int c=a*b;
		System.out.println("MUL="+c);
	}
	
	void mul(double a,double b)
	{
		double c=a*b;
		System.out.println("MUL="+c);
	}
	
	void mul(int a,double b)
	{
		double c=a*b;
		System.out.println("MUL="+c);
	}
	
	void mul(double a,int b)
	{
		double c=a*b;
		System.out.println("MUL="+c);
	}
}

public class MultiplyCalc {

	public static void main(String[] args) {
		Calculator3 c3;
		c3=new Calculator3();
		
		int a=30,b=20;
		c3.mul(a,b);
		
		double a1=34,b1=21;
		c3.mul(a1,b1);
		
		int a2=13;
		double b2=6.78;
		c3.mul(a2,b2);
		
		double a3=23.5;
		int b3=3;
		c3.mul(a3,b3);
		
	}

}
