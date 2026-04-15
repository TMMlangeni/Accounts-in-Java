 /**
@author Talani Mlangeni
@version 37335944
*/

public  class Account //implements Calculable
{
	private String accountNumber;
	private int balance;
	
	public Account()
	{
		this("0000000000", 0);
	}
	public Account( String accountNumber, int balance)
	{
		setAccountNumber(accountNumber);
		setBalance(balance);
	}
	
	public void setAccountNumber(String accountNumber)
	{

		int length = accountNumber.length();
		if (length == 10 ){
			
			//int num = Integer.parseInt(accountNumber);
			this.accountNumber=accountNumber;
			
		}
		else {
			throw new InvalidAccountNumberException("Invalid Account Number ");
		}
		
		
	}
	
	
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	public String toString()
	{
		return "Account Number: "+getAccountNumber()+"Account Balance: "+getBalance();
		
	}
	
 	public static void main(String [] args){
		
		try {
			Account a1 = new Account("1111111111", -1000);
			Account a2 = new Account("2222222222", -1250000);
			System.out.println("All is Great you got this ");
			
		}
		catch(InvalidAccountNumberException e){
				System.out.println("Account number Invalid!!");
			}
		
		
		
		
		
	} 
} 
 
/* 
 public class Account {
    private String accountNumber;
    private int balance;

    public Account() {
        this("0000000000", 0);
    }

    public Account(String accountNumber, int balance) {
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.matches("\\d{10}")) {
            this.accountNumber = accountNumber;
        } else {
            throw new InvalidAccountNumberException("Invalid Account Number");
        }
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String toString() {
        return "Account Number: " + getAccountNumber() + ", Account Balance: " + getBalance();
    }

    public static void main(String[] args) {
        try {
            Account a2 = new Account("1111111111", -1000);
            Account a3 = new Account("2222222222", -1250000);
            System.out.println("All is Great! You got this 😉");
        } catch (InvalidAccountNumberException e) {
            System.out.println("Invalid account number!");
        }
    }
}*/
