package Ass2;

class Distance
{
	int feet ;
	int inch;
	
   void	setFeet(int feet)
	{
		this.feet=feet;
	}
   
    int  getFeet()
      {
    	  return feet;
      }
	
   void	setInch(int inch)
	{
		this.inch=inch;
	}
   
     int getInch()
      {
    	  return inch;
      }
     
     void display()
     {
    	 System.out.println("THIS is the INCH:"+getInch());
    	 System.out.println("THIS is the FEET:"+getFeet());
    	 
     }
	
	
	
}

public class Test8 {

	public static void main(String[] args) {
		
		Distance d1;
		d1=new Distance();
		
		d1.setFeet(10);
		d1.setInch(12);
		
		d1.display();
	}

}

