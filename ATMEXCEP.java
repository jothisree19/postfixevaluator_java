package demo;
import java.util.Scanner;

public class ATMEXCEP {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        try {

            System.out.println("Enter amount:");
            int amount = s.nextInt();

            int balance = 5000;

            if(amount > balance) {

                throw new Exception("Insufficient Balance");
            }
            else {

                System.out.println("Withdrawal Successful");
                System.out.println("Remaining Balance: " + (balance - amount));
            }

        }
        catch(Exception e) {

            System.out.println(e.getMessage());
        }

        s.close();
    }
}