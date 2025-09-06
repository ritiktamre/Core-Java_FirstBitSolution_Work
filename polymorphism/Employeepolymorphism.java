package polymorphism;


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
	
	double calculateSal()
	{
		return salary;
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
	double totalSalary;
	
	
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
		this.totalSalary=getSalary()+getIncentive();
		return totalSalary;
	}
	void display()
	{
		System.out.println("----SalesManager Details---");
		super.display();
		System.out.println("INCENTIVE:"+incentive);
		System.out.println("TARGET:"+target);
		System.out.println("total salary:"+totalSalary);
	}
}//class ends here

class HR extends Employee
{
	int commision;
	double totalSalary;
	
	
	 HR(int id, String name, int age, String gender, double salary, int commision, double totalSalary) 
	 {
		super(id, name, age, gender, salary);
		this.commision = commision;
		this.totalSalary = totalSalary;
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
		this.totalSalary=getSalary() + getCommision();
		return totalSalary;
	}
	void display()
	{
		System.out.println("----HR Details-----");
		super.display();
		System.out.println("COMMISION:"+commision);
		System.out.println("total salary:"+totalSalary);
	}
}//class ends here

class Admin extends Employee
{
	double allowance;
	double totalSalary;
	
	
	 Admin(int id, String name, int age, String gender, double salary, double allowance, double totalSalary)
	 {
		super(id, name, age, gender, salary);
		this.allowance = allowance;
		this.totalSalary = totalSalary;
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
		this.totalSalary= getSalary() + getAllowance();
		return totalSalary;
	}
	void display()
	{
		System.out.println("-----Admin Details-----");
		super.display();
		System.out.println("ALLOWANCE:"+allowance);
		System.out.println("total salary:"+totalSalary);
	}
}//class ends here

public class Employeepolymorphism {

	public static void main(String[] args) {
	Employee e1;
	e1 = new SalesManager(101,"Ritik",24,"male",1234.5,3546,7);
	e1.calculateSal();
	e1.display();
	System.out.println();
	
	
	e1= new HR(102,"rahul",27,"male",12345.4,2345,12.3);
	e1.calculateSal();
	e1.display();
	System.out.println();
	
	e1 = new Admin(103,"ranjeet",28,"male",12345.4,346.5,1234.5);
	e1.calculateSal();
	e1.display();
	}

}
