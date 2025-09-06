package Constractor;

class Date
{
	int date;
	int month;
	int year;
	
	Date()
	{
		this.date=22;
		this.month=3;
		this.year=2020;
	}
	void setDate(int date)
	  {
		  this.date=date;
	  }
	int getDate()
	{
		return date;
	}
	
   void	setMonth(int month)
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
    
     int  getYear()
       {
    	   return year;
       }
     
     void display()
     {
    	 System.out.println("DATE="+getDate());
    	 System.out.println("MONTH="+getMonth());
    	 System.out.println("YEAR="+getYear());
     }
}

public class Test6 {

	public static void main(String[] args) {
		
		Date d1;
		d1=new Date();
		
		d1.display();

	}

}
