package demo;
import java.util.*;

public class peopleanddevil {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		int current=0;
		int max=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='P') {
				current++;
				
			}else {
				if(max>current) {
					max=current;
				}
				current=0;
				
					
			}
		}
		if(current>max) {
			max=current;
		}
	
		System.out.println(max);
		sc.close();
	}

}
