package Inheritance;

class Student
{
	int fbid;
	String name;
	int distance;
	
	Student()
	{
		
		this.fbid=101;
		this.name="Ritik";	
		this.distance=50;
		
	}
	
	Student(int fbid,String name,int distance)
	{
		
		this.fbid=fbid;
		this.name=name;
		this.distance=distance;
		
	}

	int getFbid() {
		return fbid;
	}

	void setFbid(int fbid) {
		this.fbid = fbid;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getDistance() {
		return distance;
	}

	void setDistance(int distance) {
		this.distance = distance;
	}
	void display()
	{
		System.out.println("ID:"+fbid);
		System.out.println("NAME:"+name);
		System.out.println("Distance:"+distance);
	}
}
	
	
	class PlacedStudent extends Student
	{
          	String Company;
          	String desg;
          	
          	PlacedStudent()
          	{
          		super();
          		this.Company="not assigned";
          		this.desg="not given";
          	}
          	
          	PlacedStudent(int id,String name,int distance,String cname,String d)
          	{
          		super(id,name,distance);
          		this.Company="cname";
          		this.desg="d";
          	}

			String getCompany() {
				return Company;
			}

			void setCompany(String company) {
				Company = company;
			}

			String getDesg() {
				return desg;
			}

			void setDesg(String desg) {
				this.desg = desg;
			}
          	void display()
          	{
          		super.display();
          		System.out.println("Company Name:"+Company);
          		System.out.println("Desg:"+desg);
          	}
	}
	
	


public class Test {

	public static void main(String[] args) {
		
		
		PlacedStudent p1=new PlacedStudent();
		
       p1.setFbid(123);
       p1.setName("ritik");
       p1.setDistance(800);
       p1.setCompany("RCB");
       p1.setDesg("opener");
    
         p1.display();
	}

}
