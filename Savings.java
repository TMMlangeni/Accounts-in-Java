/**
@author Talani Mlangeni
@version 37335944
*/

public class Savings extends Account
{
	
	private int minimumBalance;
	
	public Savings()
	{
		this("0000000000",0, 0);
	}
	public Savings(String accountNumber, int balance, int minimumBalance)
	{
		super(accountNumber, balance);
		setMinimumBalance(minimumBalance);
	}
	
	public void setMinimumBalance(int minimumBalance)
	{
		this.minimumBalance= minimumBalance;
	}
	

	public int getMinimumBalance ()
	{
		return minimumBalance;
	}
	
	public int calculateInterest( int interestRate)
	{
		int interestEarned=0;
		
		if(getBalance()<minimumBalance)
		{
			interestEarned=0;
		}
		else
		{
			interestEarned= (getBalance()*interestRate)/100;
		}
		return interestEarned;
	}
	
	public String toString()
	{
		return "Account Number: "+getAccountNumber()+"Minimum getBalance(): "+getMinimumBalance();
		
	}
	
}