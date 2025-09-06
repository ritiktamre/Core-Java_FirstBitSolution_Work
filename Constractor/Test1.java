package Constractor;

class Student 
{
	int rollNO;
	String name;
	int marks;
	
	Student()
	{
		this.rollNO=124;
		this.name="Rahul";
		this.marks=453;
	}

	int getRollNO() {
		return rollNO;
	}

	void setRollNO(int rollNO) {
		this.rollNO = rollNO;
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
		System.out.println("ROLLNO="+getRollNO());
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
