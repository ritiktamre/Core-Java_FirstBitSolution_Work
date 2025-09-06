package Ass2;

class Student
{
	int rollNo;
	String name;
	int marks;
	
	
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
		this.name=name;
	}

	int getMarks() {
		return marks;
	}

	void setMarks(int marks) {
		this.marks = marks;
	}
	void display()
	{
		System.out.println("ROLLNO is this student="+getRollNo());
		System.out.println("NAME is this student="+getName());
		System.out.println("MARKS is this student="+getMarks());
	}

}

public class Test2 {

	public static void main(String[] args) {
		
		Student s1;
		s1=new Student();
		
		s1.setRollNo(123);
		s1.setName("Ritik");
		s1.setMarks(456);
		
		s1.display();
	}

}
