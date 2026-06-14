package demo;
import java.util.Scanner;

public class thrownew {
	public static void main(String args[]){
		Scanner s =new Scanner(System.in);
		try {
			int stock=15;
			System.out.println("select quantity");
			int reqQuantity=(s.nextInt());	
			if(reqQuantity>stock)
			{
				
			throw new Exception("out of stock");
		}
			System.out.println("order placed successfully");
			System.out.println("only" + (stock-reqQuantity) + "exist");
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
}
		



