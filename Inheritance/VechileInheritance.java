package Inheritance;


class Vechicle
{
	String color;
	String brand;
	int model;
	
	 Vechicle(String color,String brand, int model)
	{
		this.color = color;
		this.brand = brand;
		this.model = model;
	}
	
	 Vechicle()
	 {
		 this.color="not given";
		 this.brand="not given";
		 this.model=2020;
	 }

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	int getModel() {
		return model;
	}

	void setModel(int model) {
		this.model = model;
	}
	 
	 void display()
	 {
		 System.out.println("COLOR:"+color);
		 System.out.println("Brand:"+brand);
		 System.out.println("MODEL:"+model);
	 }
	
}

class Bus extends Vechicle
{
	int noOfSeats;
	String conductor;
	int noOfDoors;
	
	 
	
	 public Bus(int noOfSeats, String conductor, int noOfDoors,String color,int model,String stering) {
		super(color,stering,model);
		this.noOfSeats = noOfSeats;
		this.conductor = conductor;
		this.noOfDoors = noOfDoors;
	}

	Bus()
	 {
		 super();
		 this.noOfDoors=23;
		 this.noOfSeats=48;
		 this.conductor="not given";
	 }

	int getNoOfSeats() {
		return noOfSeats;
	}

	void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	String getConductor() {
		return conductor;
	}

	void setConductor(String conductor) {
		this.conductor = conductor;
	}

	int getNoOfDoors() {
		return noOfDoors;
	}

	void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	 
	void display()
	{
		System.out.println("---BUS Details----");
		super.display();
		System.out.println("SEATS:"+noOfSeats);
		System.out.println("CONDUCTOR:"+conductor);
		System.out.println("DOORS:"+noOfDoors);
		
	}
	
}

class Car extends Vechicle
{
	int wheeler;
	int noOfGates;
	
	 Car(String color, String stering, int model, int wheeler, int noOfGates) 
	 {
		super(color, stering, model);
		this.wheeler = wheeler;
		this.noOfGates = noOfGates;
	}
	 
	 Car()
	 {
		 super();
		 this.wheeler=4;
		 this.noOfGates=5;
	 }

	int getWheeler() {
		return wheeler;
	}

	void setWheeler(int wheeler) {
		this.wheeler = wheeler;
	}

	int getNoOfGates() {
		return noOfGates;
	}

	void setNoOfGates(int noOfGates) {
		this.noOfGates = noOfGates;
	}
	 
	 void display()
	 {
		 System.out.println("---Car Details---");
		 super.display();
		 System.out.println("WHEELER:"+wheeler);
		 System.out.println("NOOFGATES:"+noOfGates);
	 }
	
	
}
class Truck extends Vechicle
{
	String conductor;
	int wheeler;
	String container;
	
	Truck(String conductor, int wheeler, String container,int model,String stering,String color) 
	{	
		super(color,stering,model);
		this.conductor = conductor;
		this.wheeler = wheeler;
		this.container = container;
	}
	
	Truck()
	{
		super();
		this.conductor="not given";
		this.container="not given";
		this.wheeler=14;
	}

	String getConductor() {
		return conductor;
	}

	void setConductor(String conductor) {
		this.conductor = conductor;
	}

	int getWheeler() {
		return wheeler;
	}

	void setWheeler(int wheeler) {
		this.wheeler = wheeler;
	}

	String getContainer() {
		return container;
	}

	void setContainer(String container) {
		this.container = container;
	}
	
	void display()
	{
		System.out.println("----Truck Details----");
		super.display();
		System.out.println("WHEELER:"+wheeler);
		System.out.println("CONDUCTOR:"+conductor);
		System.out.println("CONTAINER:"+container);
	}
	
	
}
public class VechileInheritance {

	public static void main(String[] args) {
	  	
        Bus b1=new Bus();
        b1.setColor("yellow");
        b1.setBrand("Eicher");
        b1.setModel(2020);
        b1.setConductor("Rajesh");
        b1.setNoOfDoors(45);
        b1.setNoOfSeats(78);
        b1.display();
        
        
        Car c1=new Car();
        c1.setColor("White");
        c1.setModel(2023);
        c1.setBrand("Swift");
        c1.setNoOfGates(4);
        c1.setWheeler(4);
	     c1.display();
	     
	     Truck t1=new Truck();
	     t1.setColor("Purple");
	     t1.setBrand("TATA");
	     t1.setModel(2018);
	     t1.setConductor("Akshay");
	     t1.setWheeler(18);
	     t1.setContainer("Banana");
	     t1.display();
	}

}
