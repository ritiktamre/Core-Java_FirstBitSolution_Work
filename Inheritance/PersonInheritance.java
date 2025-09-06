package Inheritance;

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
	 void display()
	 {
		 System.out.println("NAME="+name);
		 System.out.println("AGE:"+age);
		 System.out.println("GENDER:"+gender);
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
	 
	 void display()
	 {
		 System.out.println("----Student Details---");
		 super.display();
		 System.out.println("StudentId:"+StudentId);
		 System.out.println("Course:"+course);
	 }
	
}

class Teacher extends person

{
	int teacherId;
	String subjectSpecilization;
    
	Teacher(String name, int age, String gender, int teacherId, String subjectSpecilization)
	{
		super(name, age, gender);
		this.teacherId = teacherId;
		this.subjectSpecilization = subjectSpecilization;
	}
	
	Teacher()
	{
		super();
		this.teacherId=100;
		this.subjectSpecilization="Web Programming";
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
	
	void display()
	{
		System.out.println("---Teacher details---");
		super.display();
		System.out.println("TEACHERID:"+teacherId);
		System.out.println("SUBJECT SPECIALIZATION:"+subjectSpecilization);
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
	
	void display()
	{
		System.out.println("---Doctor Details---");
		super.display();
		System.out.println("DOCTORID:"+doctorId);
	    System.out.println("HOSPLITAL:"+hospital);
	    System.out.println("LISENSENUM:"+lisenseNum);
	}
	
}

public class PersonInheritance {

	public static void main(String[] args) {
		
     Student1 s1=new Student1();
      s1.setName("RITIK");
      s1.setAge(26);
      s1.setGender("Male");
      s1.setCourse("Java Full Stack Developer");
      s1.setStudentId(123);
      s1.display();
      
      Teacher t1=new Teacher();
       t1.setName("SHUBHAM");
       t1.setAge(28);
       t1.setGender("MALE");
       t1.setTeacherId(145);
       t1.setSubjectSpecilization("WEB PROgramming");
       t1.display();
       
       Doctor d1=new Doctor();
       d1.setAge(39);
       d1.setName("Sunil");
       d1.setGender("Male");
       d1.setDoctorId(12345);
       d1.setHospital("POONA HOSPITAL");
       d1.setLisenseNum(424335);
       d1.display();
	}

}
