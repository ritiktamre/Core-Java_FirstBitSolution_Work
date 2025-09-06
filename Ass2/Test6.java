package Ass2;

class SalesManager
{
	int id;
	String name;
	double salary;
	int incentive;
	int target;
	
	void setId(int id)
	{
		this.id=id;
	}
  int getId()
	{
		return id;
	}
  
  void setName(String name)
  {
	  this.name=name;
  }
  
 String getName()
  {
	  return name;
  }
 
  void setSalary(double salary)
   {
	   this.salary=salary;
   }
 
     double getSalary()
      {
    	  return salary;
      }
     
    void setIncentive(int incentive)
     {
    	 this.incentive=incentive;
     }
    
     int getIncentive()
      {
    	  return incentive;
      }
	
     void setTarget(int target)
     {
    	 this.target=target;
     }
     int getTarget()
     {
    	 return target;
     }
     
     void display()
     {
    	 System.out.println("This is a Id"+getId());
    	 System.out.println("This is a Name"+getName());
    	 System.out.println("This is a Salary"+getSalary());
    	 System.out.println("This is a Incentive"+getIncentive());
    	 System.out.println("This is a Target"+getTarget());
     }
}

public class Test6 {

	public static void main(String[] args) {
		
		SalesManager s1;
		s1=new SalesManager();
		
		s1.setId(123);
		s1.setName("Ritik");
		s1.setSalary(12345.67);
		s1.setIncentive(2456);
		s1.setTarget(5);
		
		s1.display();
		

	}

}

