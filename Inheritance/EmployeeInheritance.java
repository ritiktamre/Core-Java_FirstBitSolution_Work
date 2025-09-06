package Inheritance;

class Employee
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
	void display()
	{
		System.out.println("ID:"+id);
		System.out.println("NAME:"+name);
		System.out.println("AGE:"+age);
		System.out.println("SALARY:"+salary);
		System.out.println("GENDER:"+gender);
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
	void display()
	{
		System.out.println("----SalesManager Details---");
		super.display();
		System.out.println("INCENTIVE:"+incentive);
		System.out.println("TARGET:"+target);
	}
}//class ends here

class HR extends Employee
{
	int commision;
	
	
	 HR(int id, String name, int age, String gender, double salary, int commision) {
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
	void display()
	{
		System.out.println("----HR Details-----");
		super.display();
		System.out.println("COMMISION:"+commision);
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
	void display()
	{
		System.out.println("-----Admin Details-----");
		super.display();
		System.out.println("ALLOWANCE:"+allowance);
	}
}//class ends here

public class EmployeeInheritance {

	public static void main(String[] args) {
		
		
		
	

		
       SalesManager s1=new SalesManager();
        
        s1.setId(123);
        s1.setName("RAHUL");
        s1.setAge(24);
        s1.setSalary(12345.6);
        s1.setGender("MALE");
        s1.setIncentive(3456);
        s1.setTarget(6);
        s1.display();
        
        HR h1=new HR();
        h1.setId(100);
        h1.setName("Ranjeet");
        h1.setGender("Male");
        h1.setSalary(12345.6);
        h1.setAge(24);
        h1.setCommision(2000);
        h1.display();
        
        Admin a1=new Admin();
        a1.setId(101);
        a1.setName("Shubham");
        a1.setGender("Male");
        a1.setSalary(45543.6);
       a1.setAge(25);
       a1.setAllowance(3456.2);
        a1.display();
	}

}
