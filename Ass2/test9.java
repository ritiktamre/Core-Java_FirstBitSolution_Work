package Ass2;

class Complex
{
	int real;
	int imaginary;
	
  void	setReal(int real)
	{
		this.real=real;
	}
  
      int getReal()
       {
    	   return real;
       }
      
       void setImaginary(int imaginary)
       {
    	   this.imaginary=imaginary;
       }
       
    int   getImaginary()
       {
    	   return imaginary;
       }
    
    void display()
    {
    	System.out.println("This is the REAL:"+getReal());
    	System.out.println("This is the IMAGINARY:"+getImaginary());
    }
}

public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1;
		c1=new Complex();
		
		c1.setReal(2+3);
		c1.setImaginary(-9);
		c1.display();
		
	}

}
