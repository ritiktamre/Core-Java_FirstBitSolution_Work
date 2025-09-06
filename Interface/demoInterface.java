package Interface;

interface Racer
{
	void showRacer();
}

interface Product
{
	void showProduct();
}

interface Transportable 
{
	void transport();
}

///Animal class Start
class Animal implements Product
{
	public void showProduct()
	{
		System.out.println("Animal is product");
	}
	
}
class Horse extends Animal implements Racer,Transportable
{
	public void showRacer()
	{
		System.out.println("Horse Parcitipate is Race");
	}
	
	public void transport()
	{
		System.out.println("Horse can be used for ridding and pulling vechicle");
	}
	
	void info()
	{
		System.out.println("Horse is a Racer");
	}
}//class Horse ends here

class Bull extends Animal implements Racer,Transportable
{
	public void showRacer()
	{
		System.out.println("Bull Parcipate is Race");
	}
	
	public void transport()
	{
		System.out.println("Bull can be used for ridding and pulling vechicle");
	}
	
	void info()
	{
		System.out.println("Bull is a Racer");
	}
}///class Bull ends here

class Buffalo extends Animal
{
	void info()
	{
		System.out.println("This is a Buffallo");
	}
}///class Buffalo ends here


class Vehicle implements Product,Transportable
{
	public void showProduct()
	{
		System.out.println("Vehicle is a product");
	}
	
	public void transport()
	{
		System.out.println("Vehicle is used for transportable");
	}
}///class Vehicle ends here

class Car extends Vehicle implements Racer
{
	public void showRacer()
	{
		System.out.println("Car Parcipate in race");
	}
	
	void info()
	{
		System.out.println("This is a Car");
	}
	
	
}///class Car ends here


class Bike extends Vehicle implements Racer
{
	public void showRacer()
	{
		System.out.println("Bike Parcipate in Race");
	}
	void info()
	{
		System.out.println("This is a Bike");
	}
}//class Bike ends here


class Railway extends Vehicle 
{
	
	void info()
	{
		System.out.println("This is a RailWay");
	}
}///class Railway ends here


public class demoInterface {

	public static void main(String[] args) {
	
		Horse h1=new Horse();
		System.out.println("---Horse Details---");
		h1.info();
		h1.showProduct();
		h1.showRacer();
		h1.transport();
		System.out.println();
		
		Bull b1;
		b1=new Bull();
		System.out.println("---Bull Details---");
		b1.info();
		b1.showProduct();
		b1.showRacer();
		b1.transport();
		
		System.out.println();
		
		Buffalo b2;
		b2=new Buffalo();
		System.out.println("---Buffalo Details---");
		b2.showProduct();
		b2.info();
		System.out.println();
		
		Car c1;
		c1=new Car();
		System.out.println("---Car Details---");
		c1.info();
		c1.showProduct();
		c1.showRacer();
		c1.transport();
		System.out.println();
		
		Bike b3;
		b3=new Bike();
		System.out.println("---Bike Details---");
		b3.showProduct();
		b3.showRacer();
		b3.info();
		b3.transport();
		System.out.println();
		
		Railway r1;
		r1=new Railway();
		System.out.println("---Railways Details---");
		r1.info();
		r1.showProduct();
		r1.transport();
		
		System.out.println();

	}

}
