package ParameterizedConstractor;

class Date
{
	int date;
	int month;
	int year;
	
	Date(int date,int month,int year)//parameterized constructor
	{
		this.date=date;
		this.month=month;
		this.year=year;
	}
	
	Date()//default constructor
	{
		this.date=12;
		this.month=8;
		this.year=2020;
	}

	int getDate() {
		return date;
	}

	void setDate(int date) {
		this.date = date;
	}

	int getMonth() {
		return month;
	}

	void setMonth(int month) {
		this.month = month;
	}

	int getYear() {
		return year;
	}

	void setYear(int year) {
		this.year = year;
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
