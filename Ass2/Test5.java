package Ass2;

class HR
{
	int id;
	String name;
	int commision;
	
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
    
   
   
   void setCommision(int commision)
   {
	   this.commision=commision;
   }
   
  int getCommision()
   {
	   return commision;
   }
	   
	   void display()
	   {
		   System.out.println("This is the ID="+getId());
		   System.out.println("This is the Name="+getName());
		   System.out.println("This is the Commision="+getCommision());
	   }
   
   
	
}

public class Test5 {

	public static void main(String[] args) {
		
       HR h1;
       h1=new HR();
       h1.setId(123);
       h1.setName("ritik");
       h1.setCommision(2000);
       
       h1.display();
	}

}

