package Inheritance;

class Doctor1
{
	int id;
	String name;
	int age;
	String qualification;
	
	 Doctor1(int id, String name, int age, String qualification)
	 {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.qualification = qualification;
	}
	 Doctor1()
	 {
		 this.id=10022;
		 this.name="not given";
		 this.age=35;
		 this.qualification="not given";
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
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	String getQualification() {
		return qualification;
	}
	void setQualification(String qualification) {
		this.qualification = qualification;
	}
	 
	void display()
	{
		System.out.println("ID:"+id);
		System.out.println("NAME:"+name);
		System.out.println("AGE:"+age);
		System.out.println("QUALIFICATION:"+qualification);
	}
	
	
	
}//class ends here

class surgen extends Doctor1
{
	String surgicalsucessrate;
	String surgicalexpertise;
	
	 surgen(int id, String name, int age, String qualification, String surgicalsucessrate,String surgicalexpertise) 
	 {
		super(id, name, age, qualification);
		this.surgicalsucessrate = surgicalsucessrate;
		this.surgicalexpertise = surgicalexpertise;
	}
	
	surgen()
	{
		this.surgicalexpertise="not given";
		this.surgicalsucessrate="not given";
	}

	String getSurgicalsucessrate() {
		return surgicalsucessrate;
	}

	void setSurgicalsucessrate(String surgicalsucessrate) {
		this.surgicalsucessrate = surgicalsucessrate;
	}

	String getSurgicalexpertise() {
		return surgicalexpertise;
	}

	void setSurgicalexpertise(String surgicalexpertise) {
		this.surgicalexpertise = surgicalexpertise;
	}
	
	void display()
	{
		super.display();
		System.out.println("SURGICAlEXPERTISE:"+surgicalexpertise);
		System.out.println("SURGICALSUCESSRATE:"+surgicalsucessrate);
	}
	
	
}

public class doctorInheritance {

	public static void main(String[] args) {
		
       surgen s1=new surgen();
       s1.setId(12345);
       s1.setName("yogesh");
       s1.setAge(45);
       s1.setQualification("MBBS");
       s1.setSurgicalexpertise("good");
       s1.setSurgicalsucessrate("veri nice");
    
       s1.display();		   
	}

}
