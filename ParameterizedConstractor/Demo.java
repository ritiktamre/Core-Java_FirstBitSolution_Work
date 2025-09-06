package ParameterizedConstractor;

class Calculator
{
void add(int a,int b)
	{
		int c=a+b;
		System.out.println("ADD="+c);
	}

  void add(double a,double b)
  {
	  double c=a+b;
	  System.out.println("ADD="+c);
 
  }
  void add(int a,double b)
  {
	  double c=a+b;
	  System.out.println("ADD="+c);
  }
 
}///class end here

public class Demo {

	public static void main(String[] args) {
		Calculator c1;
		c1=new Calculator();
		int a=10,b=20;
		c1.add(a,b);
		
		double a1=23.4,b1=13.2;
		c1.add(a1,b1);
		
		int a2=12;
		double b2=13.5;
		c1.add(a2,b2);
		
	}

}
