package Inheritance;

class Account
{
	int acNo;
	int balance;
	String name;
	
	 Account(int acNo, int balance, String name)
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

	int getBalance() {
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
	 
	 void display()
	 {
		 System.out.println("ACNO:"+acNo);
		 System.out.println("BALANCE:"+balance);
		 System.out.println("NAME:"+name);
		
	 }
	
	
}//class ends here

class savingAc extends Account
{
	int limitPayment;
	double intrestRate;
	
	 savingAc(int acNo, int balance, String name, int limitPayment, double intrestRate) 
	 {
		super(acNo, balance, name);
		this.limitPayment = limitPayment;
		this.intrestRate = intrestRate;
	}
	 
	 savingAc()
	 {
		 super();
		 this.limitPayment=00;
		 this.intrestRate=00;	 
	 }

	int getLimitPayment() {
		return limitPayment;
	}

	void setLimitPayment(int limitPayment) {
		this.limitPayment = limitPayment;
	}

	double getIntrestRate() {
		return intrestRate;
	}

	void setIntrestRate(double intrestRate) {
		this.intrestRate = intrestRate;
	}
	 
	 void display()
	 {
		 System.out.println("---SAVING AC---");
		 super.display();
		 System.out.println("LIMIT PAYMENT:"+limitPayment);
		 System.out.println("INTREST RATE:"+intrestRate);
	 }
	 
}//class ends here

class currentAc extends Account
{
	String nolimit;
	int nolimitpayment;
	
	currentAc(int acNo, int balance, String name, String nolimit, int nolimitpayment)
	{
		super(acNo, balance, name);
		this.nolimit = nolimit;
		this.nolimitpayment = nolimitpayment;
	}
	
	currentAc()
	{
		this.nolimit="not given";
		this.nolimitpayment=0;
	}

	String getNolimit() {
		return nolimit;
	}

	void setNolimit(String nolimit) {
		this.nolimit = nolimit;
	}

	int getNolimitpayment() {
		return nolimitpayment;
	}

	void setNolimitpayment(int nolimitpayment) {
		this.nolimitpayment = nolimitpayment;
	}
	
	void display()
	{
		System.out.println("---Current Ac---");
		super.display();
		System.out.println("NO LIMIT:"+nolimit);
		System.out.println("NO LIMIT PAYMENT:"+nolimitpayment);
	}
	
	
}//class ends here

public class BankAccountinheritance {

	public static void main(String[] args) {
		
		savingAc s1=new savingAc();
		s1.setAcNo(23454556);
		s1.setBalance(2634);
		s1.setName("Rahul");
		s1.setLimitPayment(40000);
		s1.setIntrestRate(2.5);
		s1.display();
		
		
		currentAc c1=new currentAc();
		c1.setAcNo(23454556);
		c1.setBalance(2634);
		c1.setName("Ritik");
		c1.setNolimitpayment(2000000);
		c1.setNolimit("unlimited");
		c1.display();
	}
}
