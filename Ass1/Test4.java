package Ass1;

class Complex
{
	int real;
	int imaginary;
	
	void display()
	{
		System.out.printf("REAL=%d,IMAGINARY=%d",this.real,this.imaginary);
	}
}

public class Test4 {

	public static void main(String[] args) {
		
		Complex c1;
		c1=new Complex();
		
		c1.real=13;
		c1.imaginary=18;
		
		c1.display();
		

	}

}

