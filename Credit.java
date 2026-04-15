/**
@author Talani Mlangeni
@version 37335944
*/

public class Credit extends  Account
{
	
	private int overdraftLimit;
	
	public Credit()
	{
		this("0000000000",0, 0);
	}
	public Credit(String accountNumber, int balance, int overdraftLimit )
	{
		super(accountNumber, balance);
		setOverdraftLimit(overdraftLimit);
	}
	
	public void setOverdraftLimit(int OverdraftLimit)
	{
		this.overdraftLimit=overdraftLimit;
	}
	
	
	public int getOverdraftLimit ()
	{
		return overdraftLimit;
	}
	
	public int calculateInterest(  int interestRate)
	{
		int interestEarned=0;
		
		if (getBalance()<overdraftLimit)
		{
			interestEarned= getBalance()*4*interestRate/100;
		}
		else if(overdraftLimit<=getBalance() && getBalance()<0)
		{
			interestEarned= getBalance()*2*interestRate/100;
		}
		else
		{
			interestEarned= getBalance()*interestRate/100;
		}
		return interestEarned;
	}
	public String toString()
	{
		return "Account Number: "+getAccountNumber()+" Balance: "+getBalance()+" Overdraft limit: " +getOverdraftLimit();
	}
	
		
	
}