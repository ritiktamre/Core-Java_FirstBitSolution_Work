package Ass2;

class Date1
{
	int date;
	int month;
	int year;
	
	void setDate(int date)
	{
		this.date=date;
	}
	
    int getDate()
	{
		return date;
	}
    
   void setMonth(int month)
    {
    	this.month=month;
    }
  int getMonth()
   {
	   return month;
   }
  
 void setYear(int year)
  {
	  this.year=year;
  }
    int getYear()
     {
    	 return year;
     }
    
    void display()
    {
    	System.out.println("This is a DATE"+getDate());
    	System.out.println("This is a MONTH"+getMonth());
    	System.out.println("This is a YEAR"+getYear());
    }
	
}

public class Test7 {

	public static void main(String[] args) {
		
		Date1 t1;
		t1=new Date1();
		
		t1.setDate(07);
		t1.setMonth(12);
		t1.setYear(2001);
		
		t1.display();

	}

}

