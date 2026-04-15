/**
@author Talani Mlangeni
@version 37335944
*/

public class InvalidAccountNumberException extends RuntimeException {
	
	public InvalidAccountNumberException(){
		this("Account Number is Invalid");
	}
	
	public InvalidAccountNumberException(String m){
		super (m);
	}
	
}