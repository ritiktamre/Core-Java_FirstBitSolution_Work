package CaseStudy;

import java.util.Scanner;

abstract class BankAccount
{
	long acNo;
	String holderName;
	String accountType;
	double balance;
	static double interestRate;
	
	static
	{
		interestRate=3.5;
	}

	 BankAccount(long acNo, String holderName, String accountType, double balance)
	 {
		
		this.acNo = acNo;
		this.holderName = holderName;
		this.accountType = accountType;
		this.balance = balance;
	}
	
	 void calculateInterestRate() {

	}

	BankAccount()
	 {
		 this.acNo=00;
		 this.holderName="not given";
		 this.accountType="not given";
		 this.balance=0.0;
	 }

	long getAcNo()
	{
		return acNo;
	}

	void setAcNo(long acNo) 
	{
		this.acNo = acNo;
	}

	String getHolderName()
	{
		return holderName;
	}

	void setHolderName(String holderName)
	{
		this.holderName = holderName;
	}

	String getAccountType()
	{
		return accountType;
	}

	void setAccountType(String accountType)
	{
		this.accountType = accountType;
	}

	double getBalance() {
		return balance;
	}

	void setBalance(double balance)
	{
		this.balance = balance;
	}

	static double getIntrestRate()
	{
		return interestRate;
	}

	static void setIntrestRate(double intrestRate) 
	{
		BankAccount.interestRate = intrestRate;
	}
	
	void deposit(double amount)
	{
		this.balance=this.balance+amount;
		System.out.println("Amount Deposit:"+amount);
	}
	
	void withdrawal(double amount)
	{
		if(this.balance < amount)
		{
			System.out.println("MINIMUM BALANCE");
		}
		else
		{
			this.balance=this.balance-amount;
			System.out.println("Withdrawal SucessFull");
		}
	}
	 
	void checkBalance()
	{
		System.out.println("Bank Balance:"+this.balance);
	}
	 
	abstract void calculateIntrestRate();
	
	void display()
	{
		System.out.println("Account Number:"+acNo);
		System.out.println("Holder Name:"+holderName);
		System.out.println("Account Type:"+accountType);
		System.out.println("Bank Balance:"+balance);
	}
}///class BankAccount ends here
 
  class SavingAccount extends BankAccount
 {
	static final double minimumBalance;
	
	static {
		minimumBalance=10000;
	}
	  

	 SavingAccount(int acNo, String holderName, String accountType, double balance) 
	 {
		super(acNo, holderName, accountType, balance);
		
	}
	 
	 SavingAccount()
	 {
		 super();	 
	 }
	 
	double getMinimumBalance()
	{
		return minimumBalance;
	}

	
	
	void withdrawal(double amount)
	{
		if((this.balance - amount) < minimumBalance)
			
		{
			System.out.println("Withdrawal not possible as minimum Balance");
		}
		else
		{
			this.balance = this.balance - amount;
			System.out.println("Withdrawal SucessFull:"+this.balance);
		}
	}
	
	void deposit(double amount)
	{
		if(amount>0)
		{
			this.balance=this.balance+amount;
			System.out.println("Amount deposited:"+balance);
		}
		else
		{
		System.out.println("Invalid Deposit Balance");
		}
	}

	@Override
	void calculateInterestRate()
	{
		if(this.balance > minimumBalance)
		{
			double interest = this.balance*interestRate/100;
			this.balance = this.balance + interest;
			System.out.println("Balance after adding intrest:"+balance);
		}
		else
		{
			System.out.println("Balance is less than minimum balance");
			
		}
		
	}
	
	void display()
	{
		System.out.println("---Saving Account Details---");
		super.display();
		System.out.println("Balance after adding Intrest:"+balance);
	}

	@Override
	void calculateIntrestRate() {
		// TODO Auto-generated method stub
		
	}
	  
 }///class SavingAccount ends here
  
  class SalaryAccount extends BankAccount
  {
       
		static final double minbalance=10000;
		String lasttransaction;
	  
		SalaryAccount()
		{
			super();
			this.lasttransaction="00";
		}

		 SalaryAccount(long acNo, String holderName, String accountType, double balance, String lasttransaction)
		 {
			super(acNo, holderName, accountType, balance);
			this.lasttransaction = lasttransaction;
		}

		String getLasttransaction()
		{
			return lasttransaction;
		}

		void setLasttransaction(String lasttransaction)
		{
			this.lasttransaction = lasttransaction;
		}

		void withdrawal(double amount)
		{
			if(this.balance >= amount)
			{
				this.balance=this. balance - amount;
				System.out.println("Withdrawal SucessFull:"+balance);
				
			}
			else
				
			{
				System.out.println("Insufficient Balance");
			}
		}
		
		void deposit(double amount)
		{
			if(amount>0)
			{
				this.balance=this.balance+amount;
				System.out.println("Amount deposited:"+balance);
			}
			else
			{
			System.out.println("Invalid Deposit Balance");
			}
		}
		
		@Override
		void calculateInterestRate() {
			System.out.println("NO Intrest Rate Salary Account");
		}
		 
		void display()
		{
			System.out.println("---Salary Account Details---");
			super.display();
			System.out.println("Last Transaction Date:"+lasttransaction);
		}

		@Override
		void calculateIntrestRate()
		{
			
			
		}
		 
		
		  
  }///class SalaryAccount ends here

  class CurrentAccount extends BankAccount
  {
      double overdraftLimit;  
      
	 CurrentAccount(int acNo, String holderName, String accountType, double balance, double overdraftLimit)
	 {
		super(acNo, holderName, accountType, balance);
		this.overdraftLimit = overdraftLimit;
	}
     
	 CurrentAccount()
	 {
		 super();
		 this.overdraftLimit = 0;
	 }
	 

	double getOverdraftLimit() 
	{
		return overdraftLimit;
	}

	void setOverdraftLimit(double overdraftLimit)
	{
		this.overdraftLimit = overdraftLimit;
	}

	
	
	void withdrawal(double amount)
	{
		if(this.balance - amount < -overdraftLimit)
		{
			System.out.println("Exceed OverDraft Limit:Withdrawal Not Possible");
		}
		else
		{
			balance = balance - amount;
			System.out.println("Amount Withdrawal SucessFull");
		}
	}
	
	void deposit(double amount)
	{
		this.balance=this.balance+amount;
		System.out.println("Amount deposited:"+balance);
	}

	@Override
	void calculateInterestRate() {
		System.out.println("NO Intrest Rate Current Account");
	}
	
	void display()
	{
		System.out.println("---Current Ac Details---");
		super.display();
		System.out.println("OverDraft Limit:"+overdraftLimit);
	}

	@Override
	void calculateIntrestRate()
	{
		
	}
	  
  }////class CurrentAccount ends here
  
  class LoanAccount extends BankAccount
  {
	  
	  double loanAmount;
	  double repaidAmount;
	  
	  LoanAccount()
	  {
		  super();
		  this.loanAmount=00;
		  this.repaidAmount=00;
	  }
	  
	 LoanAccount(long acNo, String holderName, String accountType, double balance, double loanAmount,
			double repaidAmount) 
	 {
		super(acNo, holderName, accountType, balance);
		this.loanAmount = loanAmount;
		this.repaidAmount = repaidAmount;
	}

	 
	double getLoanAmount()
	{
		return loanAmount;
	}

	void setLoanAmount(double loanAmount)
	{
		this.loanAmount = loanAmount;
	}

	double getRepaidAmount()
	{
		return repaidAmount;
	}

	void setRepaidAmount(double repaidAmount)
	{
		this.repaidAmount = repaidAmount;
	}
    
	void deposit(double amount)
	{
		this.balance=this.balance+amount;
		this.repaidAmount=this.repaidAmount+amount;
		
		if(this.repaidAmount >=  this.loanAmount)
		{
			System.out.println("SucessFull Loan Repayment");
		}
	}
	
	void withdrawal(double amount)
	{
		System.out.println("Withdrawal not allowed Loan Account:");
	}
	
	@Override
	void calculateInterestRate()
	{
		if(this.balance > 0)
		{
			double interest =this. balance*interestRate/100;
			this.balance = this. balance + interest;
			System.out.println("Balance after adding intrest:"+balance);
		}
		else
		{
			System.out.println("Balance is less than minimum balance");
			
		}
	}
	  
	void display()
	{
		System.out.println("---Loan Account Details---");
		super.display();
		System.out.println("Loan Amount:"+loanAmount);
		System.out.println("Repaid Amount:"+repaidAmount);
	}

	@Override
	void calculateIntrestRate()
	{
	
		
	}
  
  }///class LoanAccount ends here
  
public class caseStudy
{

	public static void main(String[] args) {
	
	   Scanner s = new Scanner(System.in);
	   
	   int choice;
	   
	   System.out.println("Enter your Choice:");
	   
	   
	   System.out.println("Bank Account Menu Details");
	   System.out.println("1.Saving Account");
	   System.out.println("2.Salary Account");
	   System.out.println("3.Current Account");
	   System.out.println("4.Loan Account");
	   
	   choice = s.nextInt();
	   
	   switch(choice)
	   {
	    case 1:
		      SavingAccount s1 = new SavingAccount(100,"Ritik","Saving",10000);
		      s1.deposit(2000);
		      s1.withdrawal(1000);
		      s1.calculateInterestRate();
		      s1.display();
		      break;
		    
		    
	    case 2:
	    	
	    	   SalaryAccount s2 = new SalaryAccount(200,"Rahul","Salary",20000,"20-12-2021");
	        	s2.deposit(1000);
	    	    s2.withdrawal(1500);
	     	    s2.calculateInterestRate();
	    	    s2.display();
	    	   break;
	    	
	    case 3:
	    	    CurrentAccount c1 = new CurrentAccount(123,"Ram","Current",28000,12345);
	    	    c1.deposit(2000);
	    	    c1.withdrawal(8234);
	    	    c1.calculateInterestRate();
	    	    c1.display();
	    	    break;
	    	    
	    case 4:
	    	    LoanAccount l1 = new LoanAccount(345,"Rittu","Loan",3000,30000,5000);
	    	    l1.deposit(22350);
	    	    l1.withdrawal(1000);
	    	    l1.calculateInterestRate();
	    	    l1.display();
	    	   break;
	    	   
	    	  
	    default :
	    	System.out.println("Invalid Choice");
	    	
	    	
	   }
			   
			

	}

}
