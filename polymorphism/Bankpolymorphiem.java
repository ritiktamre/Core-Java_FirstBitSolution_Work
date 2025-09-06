package polymorphism;


class Account
{
	int acNo;
	double balance;
	String name;
	
	
	 Account(int acNo, double balance, String name)
	 {
		this.acNo = acNo;
		this.balance = balance;
		this.name = name;
	}
	 
	 Account()
	 {
		 this.acNo=1234;
		 this.balance=1226;
		 this.name="not given";
	 }

	int getAcNo() {
		return acNo;
	}

	void setAcNo(int acNo) {
		this.acNo = acNo;
	}

	double getBalance() {
		return balance;
	}

	void setBalance(int balance) {
		this.balance = balance;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
	 
	double calculateBal()
	{
		return balance;
	}
	 void display()
	 {
		 System.out.println("ACNO:"+acNo);
		 System.out.println("BALANCE:"+balance);
		 System.out.println("NAME:"+name);
		
	 }
	
	
}//class ends here

class savingAc extends Account
{
	
	double intrestRate;
	
	 savingAc(int acNo, double balance, String name, double intrestRate) 
	 {
		super(acNo, balance, name);
		
		this.intrestRate = intrestRate;
	}
	 
	 savingAc()
	 {
		 super();
		
		 this.intrestRate=00;	 
	 }

	

	double getIntrestRate() {
		return intrestRate;
	}

	void setIntrestRate(double intrestRate) {
		this.intrestRate = intrestRate;
	}
	
	double CalculateBal()
	{
	   return balance+(balance*intrestRate / 100);
	}
	 
	 void display()
	 {
		 System.out.println("---SAVING AC---");
		 super.display();
		 System.out.println("INTREST RATE:"+intrestRate);
		 System.out.println("Balance with intrest:"+calculateBal());
	 }
	 
}//class ends here

class currentAc extends Account
{
	double overdraftlimit;
	
	currentAc(int acNo, double balance, String name,double overdraftlimit)
	{
		super(acNo, balance, name);
		this.overdraftlimit = overdraftlimit;
		
	}
	
	currentAc()
	{
		this.overdraftlimit=0.0;
		
	}

	
	double getOverdraftlimit() {
		return overdraftlimit;
	}

	void setOverdraftlimit(int overdraftlimit) {
		this.overdraftlimit = overdraftlimit;
	}
	
	void display()
	{
		System.out.println("---Current Ac---");
		super.display();
		System.out.println("OVER Draft:"+overdraftlimit);
		System.out.println("Available Balance:"+calculateBal());
	}
	
	
}//class ends here


public class Bankpolymorphiem {

	public static void main(String[] args) {
		Account a1;
		a1=new savingAc(101,12345.6,"Ritik",4.0);
		a1.display();
		System.out.println();
		
		a1=new currentAc(105,134.5,"Ranjeet",5000);
		a1.display();

	}

}
