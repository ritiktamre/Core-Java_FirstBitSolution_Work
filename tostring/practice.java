package tostring;

 interface Racer
 {
	 void showRacer();
 }
 interface Product
 {
	 void showProduct();
 }
 
 interface TransportTable
 {
	 void transport();
 }
 
 ///class Animal start 
 class Animal implements Product
 {
	public  void showProduct()
	 {
		 System.out.println("Animal is a product");
	 }
 }
 
 class Bull extends Animal implements Racer,TransportTable
 {
	public void showRacer()
	 {
		 System.out.println("Bull is a Racer");
	 }
	
	public void transport()
	{
		System.out.println("Bull can be used TransportTable");
	}
	
	void info()
	{
		System.out.println("Bull is a Animal");
	}
 }///class Bull ends here
 
 class Bufallo extends Animal 
 {
	 void info()
	 {
		 System.out.println("Bufallo is a Animal");
	 }
 }///class Buffalo ends here
 
 class Horse extends Animal implements Racer,TransportTable
 {
	 public void showRacer()
	 {
		 System.out.println("Horse is a Racer");
	 }
	 
	 public void transport()
	 {
		 System.out.println("Horse can be used TransportTable");
	 }
	 
	 void info()
	 {
		 System.out.println("Horse is a Animal");
	 }
 }///class Horse ends here
 
 ///class Vehicle start
 class Vehicle implements Product,TransportTable
 {
	 public void showProduct()
	 {
		 System.out.println("All Vehicle are Product");
	 }
	 
	 public void showTransportTable()
	 {
		 System.out.println("All Vehicles are used to TransportTable");
	 }

	
	public void transport() {
		System.out.println("All vechicle are transportTable");
		
	}
 }//class Vehicle ends here
 
 class Car1  extends Vehicle implements Racer
 {
	 public void showRacer()
	 {
		 System.out.println("Car1 is a Racer");
	 }
	  
	 void info()
	 {
		 System.out.println("Car1 is a Vehicle");
	 }
	 
 }///class Car1 ends here
 
 class Railway extends Vehicle
 {
	 void info()
	 {
		 System.out.println("Railway is a Vehicle");
	 }
	 
 }///class Railway ends here
 
 
 class Bike extends Vehicle implements Racer
 {
	 public void showRacer()
	 {
		 System.out.println("Bike is a Racer");
	 }
	 
	 void info()
	 {
		 System.out.println("Bike is a Vehicle");
	 }
 }///class Bike ends here
	public class practice
{
	
	public static void main(String[] args) {
		
		Horse h1=new Horse();
		System.out.println("---Horse Details---");
		h1.showProduct();
		h1.showRacer();
		h1.transport();
		h1.info();
		System.out.println();
		
		
		Car1 c1 = new Car1();
		System.out.println("---Car Details---");
		c1.showProduct();
		c1.showRacer();
		c1.transport();
		c1.info();
		System.out.println();
		
		Bike b1 = new Bike();
		System.out.println("---Bike Details---");
		b1.showProduct();
		b1.showRacer();
		b1.transport();
		b1.info();
		System.out.println();
		
		Bufallo b2 = new Bufallo();
		System.out.println("---Bufallo Details---");
		b2.showProduct();
		b2.info();
		System.out.println();
		
		Railway r1 = new Railway();
		System.out.println("---Railway Details---");
		r1.showProduct();
		r1.transport();
		r1.info();
		System.out.println();
				
				
	}

}
