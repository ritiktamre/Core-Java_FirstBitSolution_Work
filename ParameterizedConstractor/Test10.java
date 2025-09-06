package ParameterizedConstractor;

class Product
{
	int id;
	String name;
	int quantity;
	int price;
	
	Product(int id,String name,int quantity,int price)
	{
		this.id=id;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}
	Product()
	{
		this.id=123;
		this.name="RITIK";
		this.quantity=200;
		this.price=300;
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
	int getQuantity() {
		return quantity;
	}
	void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price = price;
	}
	
	void display()
	{
		System.out.println("ID="+getId());
		System.out.println("NAME="+getName());
		System.out.println("Quantity="+getQuantity());
		System.out.println("PRICE="+getPrice());
	}
}

public class Test10 {

	public static void main(String[] args) {
		
		Product p1;
		
		p1=new Product();
		p1.display();

	}

}
