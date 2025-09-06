package tostring;


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

	@Override
	public String toString() {
		return " acNo="+acNo+", balance="+balance+", name="+name;
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

	@Override
	public String toString() {
		System.out.println("---Saving Ac---");
		return super.toString()+" ,limitPayment="+limitPayment   +  ", intrestRate="+ intrestRate;
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

	@Override
	public String toString() {
		System.out.println("---Current AC---");
		return super.toString()+" ,nolimit=" +nolimit+", nolimitpayment="+nolimitpayment;
	}
	
	
	
	
}//class ends here

public class Test2 {

	public static void main(String[] args) {
		
		Account a1;
		
		a1=new savingAc(123,1234,"ritik",4000,2.5);
		System.out.println(a1);
		
		a1=new currentAc(1345,234,"rohit","unlimited",12234454);
		System.out.println(a1);

	}

}
