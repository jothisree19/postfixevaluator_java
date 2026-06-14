package demo;
import java.util.Scanner;

class InsufficientBalance extends Exception{
	InsufficientBalance(){
		super("insufficient balance");
	}
	
public class BankAccount{
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter ammount");
		int balance=7000;
		int withdraw=(s.nextInt());
		try {
			if(withdraw > balance) {
				throw new InsufficientBalance();
				
				
			}
			System.out.println("withdraw successfull");
			System.out.println("remaining" + (balance-withdraw) + "ammount");

		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

}
