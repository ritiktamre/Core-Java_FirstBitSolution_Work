package polymorphism;


class Shop
{
	int id;
	String name;
	int workers;
	double tax;
	
	 Shop(int id, String name, int workers, double tax)
	 {
		this.id = id;
		this.name = name;
		this.workers = workers;
		this.tax = tax;
	}
	 Shop()
	 {
		 this.id=1234;
		 this.name="not given";
		 this.workers=15;
		 this.tax=12000;
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
	int getWorkers() {
		return workers;
	}
	void setWorkers(int workers) {
		this.workers = workers;
	}
	double getTax() {
		return tax;
	}
	void setTax(double tax) {
		this.tax = tax;
	}
	
	double calculateTax()
	{
		return tax;
	}
	 
	
	 void display()
	 {
		 System.out.println("ID:"+id);
		 System.out.println("NAME:"+name);
		 System.out.println("WORKERS:"+workers);
		 System.out.println("TAX:"+calculateTax());
	 }
	
	
}//class ends here

class stationaryshop extends Shop
{
	int books;
	int pen;
	int compass;
	
	 stationaryshop(int id, String name, int workers, double tax, int books, int Pens,int compass, int pen) 
	 {
		super(id, name, workers, tax);
		this.books = books;
		this.pen = pen;
		this.compass=compass;
	}
	 stationaryshop()
	 {
		 super();
		 this.books=12;
		 this.pen=100;
		 this.compass=120;
	 }
	int getBooks() {
		return books;
	}
	void setBooks(int books) {
		this.books = books;
	}
	int getPens() {
		return pen;
	}
	void setPens(int pens) {
		this.pen = pens;
	}
	int getCompass() {
		return compass;
	}
	void setCompass(int compass) {
		this.compass = compass;
	}
	
	double calculateTax()
	{
		return tax+(books * 10)+(pen*5)+(compass*8);
	}
	 
	void display()
	{
		System.out.println("---stationary details---");
		super.display();
		System.out.println("BOOKS:"+books);
		System.out.println("PENS:"+pen);
		System.out.println("COMPASS:"+compass);
	}
	
}//class ends here
public class Shopploymorphism {

	public static void main(String[] args) {
		
		Shop s1;		
	
		
	 s1 = new stationaryshop(105, "Akshay", 3, 3456, 10, 30, 50,12);
		s1.display();
		System.out.println();
	}

}
