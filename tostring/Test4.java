package tostring;


class person
{
	String name;
	int age;
	String gender;
	
	 person(String name, int age, String gender) 
	 {
	
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	 
	 person()
	 {
		 this.name="rahul";
		 this.age=25;
		 this.gender="male";
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

	@Override
	public String toString()
	{
		return "name="+name+", age="+age+", gender="+gender;
	}
	
	
	
	
}

class Student1 extends person
{
	int StudentId;
	String course;
	
	 Student1(String name, int age, String gender, int StudentId, String course) 
	 {
		super(name, age, gender);
		this.StudentId=StudentId;
		this.course= course;
	}
	
	 Student1()
	 {
		 super();
		 this.StudentId=123;
		 this.course="Java";
	 }

	int getStudy() {
		return StudentId;
	}

	void setStudentId(int StudentId) {
		this.StudentId = StudentId;
	}

	String getCourse() {
		return course;
	}

	void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString()
	{
		System.out.println("---Student Details---");
		return super.toString()+", StudentId="+StudentId+", course="+course;
	}
	 
	
	
}

class Teacher extends person

{
	int teacherId;
	String subjectSpecilization;

	Teacher(String name, int age, String gender, int teacherId, String subjectSpecilization) {
		super(name, age, gender);
		this.teacherId = teacherId;
		this.subjectSpecilization = subjectSpecilization;
	}

	Teacher() {
		super();
		this.teacherId = 100;
		this.subjectSpecilization = "Web Programming";
	}

	int getTeacherId() {
		return teacherId;
	}

	void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	String getSubjectSpecilization() {
		return subjectSpecilization;
	}

	void setSubjectSpecilization(String subjectSpecilization) {
		this.subjectSpecilization = subjectSpecilization;
	}

	@Override
	public String toString()
	{
		System.out.println("---Teacher Details---");
		return super.toString()+", teacherId="+teacherId+", subjectSpecilization="+subjectSpecilization;
	}

}

class Doctor extends person
{
	int doctorId;
	String hospital;
	int lisenseNum;
	
	Doctor(String name, int age, String gender, int doctorId, String hospital, int lisenseNum)
	{
		super(name, age, gender);
		this.doctorId = doctorId;
		this.hospital = hospital;
		this.lisenseNum = lisenseNum;
	}
	
	Doctor()
	{
		super();
		this.doctorId=123;
		this.hospital="Deccan Gymkhana";
		this.lisenseNum=573541;
	}

	int getDoctorId() {
		return doctorId;
	}

	void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	String getHospital() {
		return hospital;
	}

	void setHospital(String hospital) {
		this.hospital = hospital;
	}

	int getLisenseNum() {
		return lisenseNum;
	}

	void setLisenseNum(int lisenseNum) {
		this.lisenseNum = lisenseNum;
	}

	@Override
	public String toString() 
	{
		System.out.println("---Teacher Details---");
		return super.toString()+", doctorId="+doctorId+", hospital="+hospital+", lisenseNum=" +lisenseNum;
	}
	
	
	
}

public class Test4 {

	public static void main(String[] args) {
	
		  person p1;
		  
		  p1=new Student1("Ritik",23,"male",156,"Java full stack");
		  System.out.println(p1);
		  
		  p1=new Teacher("Rahul",20,"male",123,"Adv Java");
		  System.out.println(p1);
		  
		  p1=new Doctor("Saloni",45,"female",2345,"Poona",12345566);
		  System.out.println(p1);

	}

}
