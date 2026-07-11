package demo;
import java.util.Scanner;

public class prime_hex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     boolean isPrime=true;
	     
	     if(n<=1) {
	    	 isPrime= false;
	     }
	     for(int i=2;i<=Math.sqrt(n);i++) {
	    	 if(n%i==0){
	    		 isPrime=false;
	    	 }
	    	 
	    	 
	     }
	     if(isPrime) {
	    	 System.out.println("prime num");
	    	 }
	    	 else {
	    		 System.out.println(" not a prime num");
	    	 }
	
			sc.close();
	}
}



