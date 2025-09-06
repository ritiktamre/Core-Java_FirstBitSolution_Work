package Abstract;


abstract class Employee
{
	int id;
	String name;
	double salary;
	int age;
	String gender;
	
	Employee(int id,String name,int age,String gender,double salary)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.salary=salary;
	}
	
	Employee()
	{
		this.id=101;
		this.name="Ritik";
		this.age=24;
		this.gender="Male";
		this.salary=12345.6;
	}

	int getId() {
		return id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	String getGender() {
		return gender;
	}

	void setGender(String gender) {
		this.gender = gender;
	}

	void setId(int id) {
		this.id = id;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}
	
	abstract double calculateSal();
	
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", gender=" + gender;
	}
	
	
}//class ends here

 class SalesManager extends Employee
{
	int incentive;
	int target;
	
	
	
	 SalesManager(int id, String name, int age, String gender, double salary, int incentive, int target)
	 {
		super(id, name, age, gender, salary);
		this.incentive = incentive;
		this.target = target;
	}
	SalesManager()
	{
		super();
		this.incentive=3456;
		this.target=5;
	}
	int getIncentive() {
		return incentive;
	}
	void setIncentive(int incentive) {
		this.incentive = incentive;
	}
	int getTarget() {
		return target;
	}
	void setTarget(int target) {
		this.target = target;
	}
	
  double calculateSal()
	{
		salary=salary+incentive;
		return salary;
	}
@Override
public String toString() {
	System.out.println("--SalesManager details--");
	return super.toString()+"incentive=" + incentive + ", target=" + target ;
}
	
}//class ends here

 class HR extends Employee
{
	int commision;
	
	
	
	 HR(int id, String name, int age, String gender, double salary, int commision) 
	 {
		super(id, name, age, gender, salary);
		this.commision = commision;
		
	}
	HR()
	{
		super();
		this.commision=2000;
	}
	int getCommision() {
		return commision;
	}
	void setCommision(int commision) {
		this.commision = commision;
	}
	
	 double calculateSal()
	 {
		salary=salary+commision;
		return salary;
	 }
	
	@Override
	public String toString()
	{
		System.out.println("--HR Details--");
		return super.toString()+"commision=" + commision ;
	}
	
}//class ends here

 class Admin extends Employee
{
	double allowance;
	
	
	
	 Admin(int id, String name, int age, String gender, double salary, double allowance)
	 {
		super(id, name, age, gender, salary);
		this.allowance = allowance;
		
	}
	Admin()
	{
		this.allowance=3467.7;
	}
	double getAllowance() {
		return allowance;
	}
	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	 double calculateSal()
	 {
		 salary=salary+allowance;
		 return salary;
	 }
	
	@Override
	public String toString() {
		System.out.println("---Admin Details---");
		return super.toString()+"allowance=" + allowance;
	}
	
}//class ends here

public class Test1 {

	public static void main(String[] args) {
		Employee e1;
		
		e1 = new SalesManager(101,"Ritik",24,"male",1234.5,3546,7);
		e1.calculateSal();
		
		System.out.println(e1);
		
		
		e1= new HR(102,"rahul",27,"male",12345.4,2345);
		e1.calculateSal();
		
		System.out.println(e1);
		
		e1 = new Admin(103,"ranjeet",28,"male",12345.4,346.5);
		e1.calculateSal();
;	     System.out.println(e1);

	}

}
