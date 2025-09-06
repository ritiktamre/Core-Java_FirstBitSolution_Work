package Ass2;


class Product
{
	int id;
	String name;
	int quantity;
	double price;
	
  void	setId(int id)
	{
		this.id=id;
	}
  
     int getId()
        {
        	return id;
        }
     
     void setName(String name)
     {
    	 this.name=name;
     }
     
     String getName()
     {
    	 return name;
     }
     
     void setQuantity(int quantity)
     {
    	 this.quantity=quantity;
     }
     
    int getQuantity()
     {
    	 return quantity;
     }
    void setPrice(double price)
    {
    	this.price=price;
    }
    
   double getPrice()
    {
    	return price;
    }
   
   void display()
   {
	   System.out.println("This ia a ID:"+getId());
	   System.out.println("This ia a NAME:"+getName());
	   System.out.println("This ia a QUANTITY:"+getQuantity());
	   System.out.println("This ia a PRICE:"+getPrice());
   }

}

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1;
		p1=new Product();
		
		p1.setId(123);
		p1.setName("Ritik");
		p1.setQuantity(500);
		p1.setPrice(123.2);
		
		p1.display();
	}

}
