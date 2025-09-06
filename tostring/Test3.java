package tostring;


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
	@Override
	public String toString() {
		return "id="+id+", name="+name+", age="+age+", qualification="+qualification;
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

	@Override
	public String toString() {
		System.out.println("---Surgen Detaile---");
		return super.toString() +", surgicalsucessrate="+surgicalsucessrate+", surgicalexpertise="+surgicalexpertise ;
	}
	
	
	
	
}
public class Test3 {

	public static void main(String[] args) {
		
		Doctor1 d1;
		
		d1=new surgen(101,"Raju",35,"MBBS","Good","Good");
		System.out.println(d1);

	}

}
