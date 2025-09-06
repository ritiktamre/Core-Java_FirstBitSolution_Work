package ParameterizedConstractor;

class SalesManager
{
	int id;
	String name;
	double salary;
	int incentive;
	int target;
	
	SalesManager(int id,String name,double salary,int incentive,int target)//parameterized constructor
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.incentive=incentive;
		this.target=target;
	}
	
	SalesManager()//default constructor
	{
		this.id=145;
		this.name="RITIK";
		this.salary=12345.67;
		this.incentive=3000;
		this.target=5;
	}
	 
	 void setId(int id)
	   {
		   this.id=id;
	   }
	 
	 void setName(String name)
	 {
		 this.name=name;
	 }
	 
	 void setSalary(double salary)
	 {
		 this.salary=salary;
	 }
	 
	 void setIncentive(int incentive)
	 {
		 this.incentive=incentive;
	 }
	 
	 void setTarget(int target)
	 {
		 this.target=target;
	 }
	   int getId()
	   {
		   return id;
	   }
	   
	  String getName()
	   {
		   return name;
	   }
	  
	  double getSalary()
	  {
		  return salary;
	  }
	  
	 int getIncentive()
	 {
		 return incentive;
	 }
	 
	 int getTarget()
	 {
		 return target;
	 }
	 void display()
	 {
		 System.out.println("ID="+getId());
		 System.out.println("NAME="+getName());
		 System.out.println("SALARY="+getSalary());
		 System.out.println("INCENTIVE="+getIncentive());
		 System.out.println("TARGET="+getTarget());
	 }
}

public class Test5 {

	public static void main(String[] args) {
		SalesManager s1;
		
		s1=new SalesManager();
		
		s1.display();

	}

}
