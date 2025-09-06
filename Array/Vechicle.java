package Array;


class Vechicle1
{
	String color;
	String brand;
	int model;
	
	 Vechicle1(String color,String brand, int model)
	{
		this.color = color;
		this.brand = brand;
		this.model = model;
	}
	
	 Vechicle1()
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

class Bus extends Vechicle1
{
	int noOfSeats;
	String conductor;
	int noOfDoors;
	
	 
	
	 public Bus(int noOfSeats, String conductor, int noOfDoors,String color,int model,String brand) {
		super(color,brand,model);
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

class Car extends Vechicle1
{
	int wheeler;
	int noOfGates;
	
	 Car(String color, String brand, int model, int wheeler, int noOfGates) 
	 {
		super(color, brand, model);
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
class Truck extends Vechicle1
{
	String conductor;
	int wheeler;
	String container;
	
	Truck(String conductor, int wheeler, String container,int model,String brand,String color) 
	{	
		super(color,brand,model);
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

public class Vechicle {

	public static void main(String[] args) {
		Vechicle1[] arrVe;
		arrVe= new Vechicle1[3];
		
		arrVe[0]=new Bus(20,"ramu",20,"yellow",2020,"eicher");
		arrVe[1]=new Truck("orange",2020,"eicher",14,"RAM","fruitload");
		arrVe[2]=new Car("blue","swift",2021,4,5);

		for(int i=0;i < arrVe.length;i++)
		{
			arrVe[i].display();
			System.out.println();
			
		}
	}

}
