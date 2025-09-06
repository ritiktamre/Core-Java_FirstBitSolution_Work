package downcasting;

class Employee
{
	int id;
	String name;
	double salary;
	
	Employee()
	{
		this.id=0;
		this.name="not given";
		this.salary=00;
	}

	 Employee(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}
	void display()
	{
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
	}
	
}

class SalesManager extends Employee
{
	double incentive;
	int target;
	
	SalesManager()
	{
		this.incentive=0;
		this.target=0;
	}

	 SalesManager(int id, String name, double salary, double incentive, int target)
	 {
		super(id, name, salary);
		this.incentive = incentive;
		this.target = target;
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
		System.out.println("--SalesManager Details--");
		super.display();
		System.out.println("Incentive:"+incentive);
		System.out.println("Target:"+target);
	}
	
}

class Admin extends Employee
{
	int allowance;
	
	Admin()
	{
		super();
		this.allowance=0;
	}

	 Admin(int id, String name, double salary, int allowance) {
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
		 System.out.println("--Admin details--");
		 super.display();
		 System.out.println("Allowance:"+allowance);
	 }
	
}

public class Emp {

	public static void main(String[] args) {
		
            Employee e1=new SalesManager(100,"Ritik",25000,2500,24);
            
            Employee e2 = new Admin(150,"ridhan",35000,3452);
            
            if (e1 instanceof SalesManager) {
    			SalesManager s1 = (SalesManager) e1;
    			s1.display(); 
    			
    			
    		}

    		if (e2 instanceof Admin) {
    			Admin a1 = (Admin) e2;
    			a1.display(); 
    			
	}

}
}