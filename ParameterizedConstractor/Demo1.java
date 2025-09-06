package ParameterizedConstractor;

class Printer
{
	void print(String a)
	{
		System.out.println("ANS="+a);
		
	}
	void print(int a)
	{
		System.out.println("ANS="+a);
	}
	
	void print(double a)
	{
		System.out.println("ANS="+a);
	}
	void print(char a)
	{
		System.out.println("ANS="+a);
	}
}

public class Demo1 {

	public static void main(String[] args) {
		
		Printer p1;
		p1=new Printer();
		p1.print("RITIK");
		p1.print(10);
		p1.print(20.8);
		p1.print('f');
		

	}

}
