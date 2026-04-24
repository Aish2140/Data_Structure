package ExceptionHandling;

import java.util.Scanner;
class UserPinMismatchException extends Exception{
	3.
	3.6@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Invalid UserPin....card blocked...contact ur bank";
	}
	

}

class Atm{
	int user_pin=5689;
	int pin;
	public void acceptInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pin: ");
		pin=sc.nextInt();
	}
	public void validate()throws UserPinMismatchException {
		if(pin==user_pin)
		{
			System.out.println("Please collect the cash..transaction completed");
		}
		else {
			UserPinMismatchException epm=new UserPinMismatchException();
			throw epm;
		}
	}
}
class Bank{
	public void permit() {
		Atm atm=new Atm();
		try {
			atm.acceptInput();
			atm.validate();
		}catch(UserPinMismatchException e)
		{
			System.out.println("Incorrect pin..try again  attempt 1 failed");
			try {
				atm.acceptInput();
				atm.validate();
			}
			catch(UserPinMismatchException p)
			{
				System.out.println("Incorrect pin..try again  attempt 2 failed");
				try {
					atm.acceptInput();
					atm.validate();
				}catch(Exception m) {
					System.out.println("Incorrect pin.. attempt 3 failed");
					System.out.println(e.getMessage());
				}
				
			
			}
			
		}
	
	}
}
public class RBI {
	public static void main(String[] args) {
	Bank bank=new Bank();
	bank.permit();
	}
	


}
