package demo;
import java.util.Scanner;
enum UserRole {

    ADMIN(3),
    MANAGER(2),
    EMPLOYEE(1);

    int level;

    UserRole(int level) {

        this.level = level;
    }
}

public class role {

    public static void main(String[] args) {
    	
    	System.out.println("enter preference");
    	System.out.println("ADMIN / MANAGER / EMPLOYEE");
    	Scanner s=new Scanner(System.in);
    	
    	String choice = s.nextLine();
    //	System.out.println("ADMIN / MANAGER / EMPLOYEE");
     
    	UserRole u = UserRole.valueOf(choice);
     	System.out.println("ROLE:" + u);
     	System.out.println("ACCESS LEVEL:" + u.level);
    	
    	switch(u) {
    	case ADMIN:{
    		System.out.println("Permission:" + "full permission");
    		break;
    	}
    	
    	case MANAGER:{
    		System.out.println("permission:" + "team access");
    		break;
    	}
    	case EMPLOYEE:{
    		System.out.println("permission:" + "workspace only");
    		break;
    	
    	}
     	
    	}
    }
}
 
        