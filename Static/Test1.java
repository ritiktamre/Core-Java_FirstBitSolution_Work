package Static;

class BankAccount
{
	int id;
	String name;
	double balance;
	static double intrestRate;
	
	static 
	{
		intrestRate=9.2;
	}
	
	 BankAccount(int id, String name, double balance)
	 {
	
		this.id = id;
		this.name = name;
		this.balance = balance;
		
	}
	 
	 BankAccount()
	 {
		 this.id=123;
		 this.name="Ritik";
		 this.balance=0.0;
		
	 }

	int getId()
	{
		return id;
	}

	void setId(int id)
	{
		this.id = id;
	}

	String getName()
	{
		return name;
	}

	void setName(String name)
	{
		this.name = name;
	}

	double getBalance()
	{
		return balance;
	}

	void setBalance(double balance)
	{
		this.balance = balance;
	}
  
	  static void setIntrest(double intrest)
	 {
		 intrestRate=intrest;
	 }

	 
	 void display()
	 {
		 System.out.println("Name is:"+name);
		 System.out.println("Id is:"+id);
		 System.out.println("Balance is:"+balance);
		System.out.println("intrestRate:"+intrestRate);
	 }
	
	
}
public class Test1 {

	public static void main(String[] args) {
		 
		BankAccount b1;
		b1=new BankAccount(123,"ritik",1234.7);
		b1.display();
		System.out.println();
		
		BankAccount b2;
		b2=new BankAccount(12,"Rahul",178);
		b2.display();
		System.out.println();
		
		BankAccount b3;
		b3=new BankAccount(20,"Raju",200);
		b3.display();
		System.out.println();
		
		
		BankAccount.setIntrest(8.5);
		b1.display();
        System.out.println();
        
        BankAccount.setIntrest(2.5);
        b2.display();
        System.out.println();
	}

}
