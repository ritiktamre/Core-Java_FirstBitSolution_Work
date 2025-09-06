package tostring;

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

	@Override
	public String toString()
	{
		return "color=" + color + ", brand=" + brand + ", model=" + model;
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

	@Override
	public String toString()
	{
		System.out.println("---Bus Details---");
		return super.toString()+ ", noOfSeats=" + noOfSeats + ", conductor=" + conductor + ", noOfDoors=" + noOfDoors ;
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

	@Override
	public String toString()
	
	{
		System.out.println("---Car Details---");
		return super.toString()+ ", wheeler=" + wheeler + ", noOfGates=" + noOfGates ;
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

	@Override
	public String toString()
	{
		System.out.println("---Truck Details---");
		return  super.toString()+", conductor=" + conductor + ", wheeler=" + wheeler + ", container=" + container;
	}
	

	
	
}
public class Test6 {

	public static void main(String[] args) {
		
        Vechicle v1;
        
        v1=new Bus();
        System.out.println(v1);
        
        v1=new Car();
        System.out.println(v1);
        
        v1=new Truck();
        System.out.println(v1);
	}

}
