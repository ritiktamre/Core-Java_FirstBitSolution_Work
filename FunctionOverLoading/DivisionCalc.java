package FunctionOverLoading;

class Calculator4
{
	void div(int a,int b)
	{
		int c=a*b;
		System.out.println("DIV="+c);
	}
	
	void div(double a,double b)
	{
		double c=a*b;
		System.out.println("DIV="+c);
	}
	
	void div(int a,double b)
	{
		double c=a*b;
		System.out.println("DIV="+c);
	}
	
	void div(double a,int b)
	{
		double c=a*b;
		System.out.println("DIV="+c);
	}
}

public class DivisionCalc {

	public static void main(String[] args) {
		
		Calculator4 c4;
		c4=new Calculator4();
		
		int a=45,b=3;
		c4.div(a,b);
		
		double a1=36.3,b1=6.1;
		c4.div(a1,b1);
		
		int a2=72;
		double b2=9.4;
		c4.div(a2,b2);
		
		double a3=78.6;
		int b3=8;
		c4.div(a3,b3);
		

	}

}
