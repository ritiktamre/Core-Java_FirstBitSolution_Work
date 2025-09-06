package Array;


class Employee1
{
	int id;
	String name;
	double salary;
	
	
	int getId()
	{
		return id;
	}
	void setId(int id) 
	{
		this.id = id;
	}
	String getName()
	{
		return name;
	}
	void setName(String name) 
	{
		this.name = name;
	}
	double getSalary()
	{
		return salary;
	}
	void setSalary(double salary)
	{
		this.salary = salary;
	}
	 Employee1(int id, String name, double salary)
	 {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	 
	 Employee1()
	 {
		 this.id=10;
		 this.name="not given";
		 this.salary=00;
	 }
	void display()
	{
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
	}
	
}///class ends here

class SalesManager extends  Employee1
{
	double incentive;
	int target;
	
	 SalesManager(int id, String name, double salary, double incentive, int target) 
	 {
		super(id, name, salary);
		this.incentive = incentive;
		this.target = target;
	}
	 
	 SalesManager()
	 {
		 super();
		 this.incentive=12345.6;
		 this.target=8;
	 }

	double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	int getTarget() {
		return target;
	}

	void setTarget(int target) {
		this.target = target;
	}
	
	void display()
	{ 
		System.out.println("--SalesManager--");
		super.display();
		System.out.println("Incentive:"+incentive);
		System.out.println("Target:"+target);
	}
	
}//class ends here

class Admin extends Employee1

{
	int allowance;

    Admin(int id, String name, double salary, int allowance) 
    {
		super(id, name, salary);
		this.allowance = allowance;
	}

	int getAllowance() {
		return allowance;
	}

	void setAllowance(int allowance) {
		this.allowance = allowance;
	}
	
    void display()
    {
    	System.out.println("--Admin Details--");
    	super.display();
    	System.out.println("ALLOWANCE:"+allowance);
    }
	
	
}///class ends here

class HR extends Employee1
{
	int commision;

	 HR(int id, String name, double salary, int commision)
	 {
		super(id, name, salary);
		this.commision = commision;
	}
	 
	 HR()
	 {
		 super();
		 this.commision=123;
		 
	 }

	int getCommision() {
		return commision;
	}

	void setCommision(int commision) {
		this.commision = commision;
	}
	 
	 void display()
	 {
		 System.out.println("--HR Details--");
		 super.display();
		 System.out.println("COMMISION:"+commision);
	 }
	
}

public class Test1 {

	public static void main(String[] args) {
		  Employee1[] arrEmp;
		   arrEmp=new Employee1[3];
		
		arrEmp[0]=new Admin(101,"Ritik",20000,1234);
		arrEmp[1]=new SalesManager(101,"rahuk",25999,12.5,7);
		arrEmp[2]=new HR(103,"rohit",30000,3456);
		
		for(int i=0;i<arrEmp.length;i++)
		
       arrEmp[i].display();

		
		System.out.println();

	}

}
