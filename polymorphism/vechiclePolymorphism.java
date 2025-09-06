package polymorphism;

class Vehicle{
	String brand;
	int speed;
	String brake;
	
	
	Vehicle(){
		this.brand="not gievn";
		this.speed=000;
		this.brake="not given";
		
	}
	
	Vehicle(String brand,int speed,String brake){
		this.brand=brand;
		this.speed=speed;
		this.brake=brake;
		
		
	}
	
	void setBrand(String brand ){
		this.brand=brand;
	}
	
	String getBrand()
	{
		return this.brand;
	}
	void setSpeed(int speed ){
		this.speed=speed;
	}
	
	int getspeed()
	{
		return this.speed;
	}
	
	void brake() {
		System.out.println(" brand is "+ brand);
		System.out.println(" speed is "+ speed);
		System.out.println("brake system is "+ brake);
		
	}
	
} // vehicle class end here

class Car extends Vehicle{
	int doors;
	Car(){
		super();
		this.doors=000;
		
		
	}
	
	Car(String brand, int speed, String brake,int doors  ){
		super(brand,speed,brake);
		this.doors=doors;
		
		
	}
	
	void setDoors(int doors) {
		this.doors=doors;
		
	}
	int getDoors() {
		return this.doors;
	}
	
	void brake() {
		super.brake();
		System.out.println(" no of doors "+ doors);
	}
}// car class end here


class Bike extends Vehicle{
	int wheel;
	
	Bike() {
		super();
		this.wheel = 000;
	}
	Bike(String brand ,int speed,String brake,int wheel) {
		super(brand,speed,brake);
		this.wheel = wheel;
	}
	 int getTyre() {
		return wheel;
	}
    void setTyre(int wheel) {
		this.wheel = wheel;
	}
	void brake() {
		super.brake();
		System.out.println(" no of wheel is "+ wheel);
	}
	
}//bike class end here



public class vechiclePolymorphism {

	public static void main(String[] args) {
		
		Vehicle v1;
		v1=new Car("Safari",120, "Hydraulic",4);
		v1.brake();
		System.out.println();
		
		v1=new Bike("hero",60,"drum",2);
		v1.brake();
		

	}

}
