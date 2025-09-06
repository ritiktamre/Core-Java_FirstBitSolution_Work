package Ass1;


	class Date
	{
		int day;
		int month;
		int year;
	    
		void display()
		{
			System.out.printf("%d/%d/%d",this.day,this.month,this.year);
		}

	}


	public class Test1 {

		public static void main(String[] args) {
			Date d1;
			d1=new Date();
		  
			d1.day=02;
			d1.month=5;
			d1.year=2025;
			
			d1.display();
			
		}

	}


