package Array;

class Shop
{
	int id;
	String name;
	int workers;
	int tax;
	
	 Shop(int id, String name, int workers, int tax)
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
	int getTax() {
		return tax;
	}
	void setTax(int tax) {
		this.tax = tax;
	}
	 
	 void display()
	 {
		 System.out.println("ID:"+id);
		 System.out.println("NAME:"+name);
		 System.out.println("WORKERS:"+workers);
		 System.out.println("TAX:"+tax);
	 }
	
	
}//class ends here

class stationaryshop extends Shop
{
	int books;
	int pen;
	int compass;
	
	 stationaryshop(int id, String name, int workers, int tax, int books, int Pens,int compass, int pen) 
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
	 
	void display()
	{
		System.out.println("---stationary details---");
		super.display();
		System.out.println("BOOKS:"+books);
		System.out.println("PENS:"+pen);
		System.out.println("COMPASS:"+compass);
	}
	
}//class ends here

class Electronics extends Shop
{
	String model;
	String reparingservice;
	int charger;
	
	 Electronics(int id, String name, int workers, int tax, String model, String reparingservice, int charger)  
	 {
		super(id, name, workers, tax);
		this.model = model;
		this.reparingservice = reparingservice;
		this.charger = charger;
	}
	 Electronics()
	 {
		 super();
		 this.model="not given";
		 this.reparingservice="not given";
		 this.charger=100;
	 }
	String getModel() {
		return model;
	}
	void setModel(String model) {
		this.model = model;
	}
	String getReparingservice() {
		return reparingservice;
	}
	void setReparingservice(String reparingservice) {
		this.reparingservice = reparingservice;
	}
	int getCharger() {
		return charger;
	}
	void setCharger(int charger) {
		this.charger = charger;
	}
	 
	 void display()
	 {
		 System.out.println("---Electronice Details---");
		 super.display();
		 System.out.println("MODEL:"+model);
		 System.out.println("REPARING SERVICE:"+reparingservice);
		 System.out.println("CHARGER:"+charger);
	 }
	 
}

public class Shop1 {

	public static void main(String[] args) {
		
        Shop[] arrs;
        arrs=new Shop[2];
        
        arrs[0]=new stationaryshop(123,"ritik",5,12000,100,124,198,87);
        arrs[1]=new Electronics(127,"rahul",3,10000,"bajaj","good",145);
        
        for(int i=0;i<arrs.length;i++)
        {
        	
        	arrs[i].display();
        	System.out.println();
        	
        }
	}

}
