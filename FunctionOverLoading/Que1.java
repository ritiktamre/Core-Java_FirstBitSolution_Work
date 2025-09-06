package FunctionOverLoading;

class Calculator
{
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Add="+c);
	}
	
	void add(double a1,double b1)
	{
		double c=a1+b1;
		System.out.println("Add="+c);

	}
	void add(int a2,double b2)
	{
		double c=a2+b2;
		System.out.println("Add="+c);
	}
	
	void add(double a3,int b3)
	{
		double c=a3+b3;
		System.out.println("Add="+c);
	}
	
	void sub(int i,int j)
	{
		int p=i-j;
		System.out.println("Sub="+p);
	}
	void sub(double i1,double j1)
	{
		double p=i1-j1;
		System.out.println("Sub="+p);
	}
	void sub(int i2,double j2)
	{
		double p=i2-j2;
		System.out.println("Sub="+p);
	}
	
	void sub(double i3,int j3)
	{
		double p=i3-j3;
		System.out.println("Sub="+p);
	}
	void mul(int q,int r)
	{
		int p=q*r;
		System.out.println("Mul="+p);
	}
	
	void mul(double q1,double r1)
	{
		double p=q1*r1;
		System.out.println("Mul="+p);
	}
	void mul(int q2,double r2)
	{
		double p=q2*r2;
		System.out.println("Mul="+p);
	}
	void mul(double q3,int r3)
	{
		double p=q3*r3;
		System.out.println("Mul="+p);
	}
	void div(int x,int y)
	{
		int c=x/y;
		System.out.println("DIV="+c);
	}
	
	void div(double x1,double y1)
	{
		double c=x1/y1;
		System.out.println("DIV="+c);
	}
	
	void div(int x2,double y2)
	{
		double c=x2/y2;
		System.out.println("DIV="+c);
	}
	
	void div(double x3,int y3)
	{
		double c=x3/y3;
		System.out.println("DIV="+c);
	}
}
public class Que1 {

	public static void main(String[] args) {
		
		Calculator c1=new Calculator();
	
		int a=10;
		int b=20;
		c1.add(a,b);
		
		double a1=12.3;
		double b1=34.5;
		c1.add(a1, b1);
	
		int a2=14;
		double b2=34.5;
		c1.add(a2, b2);
		
		double a3=23.4;
		int b3=12;
		c1.add(a3, b3);
		
	
		int i=34;
		int j=23;
		c1.sub(i,j);
		
		double i1=34.5;
		double j1=23.4;
		c1.sub(i1, j1);
		
        int i2=15;
        double j2=11.4;
        c1.sub(i2, j2);
        
        double i3=34.6;
        int j3=28;
        c1.sub(i3, j3);
		
	
	
		int q=12;
		int r=20;
		c1.mul(q,r);
		
		double q1=13.2;
		double r1=2.2;
		c1.mul(q1,r1);
		
		int q2=24;
		double r2=12.2;
		c1.mul(q2,r2);
		
		double q3=12.4;
		int r3=8;
		c1.mul(q3,r3);
		
		
		int x=45,y=3;
		c1.div(x,y);
		
		double x1=36.3,y1=6.1;
		c1.div(x1,y1);
		
		int x2=72;
		double y2=9.4;
		c1.div(x2,y2);
		
		double x3=78.6;
		int y3=8;
		c1.div(x3,y3);

	
	
	
	}

}
