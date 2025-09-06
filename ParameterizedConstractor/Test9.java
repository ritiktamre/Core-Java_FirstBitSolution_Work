package ParameterizedConstractor;

class Complex
{
	int real;
	int imaginary;
	
	Complex(int real,int imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}
	Complex()
	{
		this.real=12;
		this.imaginary=15;
	}
	
	
	int getReal() {
		return real;
	}
	void setReal(int real) {
		this.real = real;
	}
	int getImaginary() {
		return imaginary;
	}
	void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	void display()
	{
		System.out.println("REAL="+getReal());
		System.out.println("IMAGINARY="+getImaginary());
	}
}

public class Test9 {

	public static void main(String[] args) {
		
		Complex c1;
		c1=new Complex();
		
		c1.display();

	}

}
