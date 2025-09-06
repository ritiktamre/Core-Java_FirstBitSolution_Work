package ParameterizedConstractor;


class Student
{
	int rollNo;
	String name;
	int marks;
	
	Student(int rollNo,String name,int marks) //parameterized constructor
	{
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	
	Student()
	{
		this.rollNo=123;
		this.name="RITIK";
		this.marks=345;
	}

	int getRollNo() {
		return rollNo;
	}

	void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getMarks() {
		return marks;
	}

	void setMarks(int marks) {
		this.marks = marks;
	}
	
	void display()
	{
		System.out.println("ROLLNO="+getRollNo());
		System.out.println("NAME="+getName());
		System.out.println("MARKS="+getMarks());
	}
}
public class Test1 {

	public static void main(String[] args) {
		
		Student s1;
		s1=new Student();
		
		s1.display();

	}

}
