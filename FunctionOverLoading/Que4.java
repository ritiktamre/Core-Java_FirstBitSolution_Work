package FunctionOverLoading;

class Complex
{
	int real;
	int imaginary;
	
	void add(int real,int imaginary)
	{
		int c=real+imaginary;
		System.out.println("COMPLEX NUMBER="+c);
	}
	
	void add(double real,int imaginary)
	{
		double c=real*imaginary;
		System.out.println("COMPLEX NUMBER="+c);
	}
}

public class Que4 {

	public static void main(String[] args) {
		
		Complex c1=new Complex();
		
		int a=34+3;
		int b=23+7;
		c1.add(a,b);
		
		double a1=12.4+5;
		int b1=14;
		c1.add(a1,b1);
		

	}

}
