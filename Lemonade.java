package demo;
import java.util.Scanner;


public class Lemonade {
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] bills=new int[n];
		for(int i=0;i<n;i++) {
			bills[i]=sc.nextInt();
		}
		int five=0;
		int ten=0;
		Boolean possible=true;
		for(int i=0;i<n;i++) {
			if(bills[i]==5) {
				five++;
			}else if(bills[i]==10) {
				if(five<0) {
					possible=false;
					break;
				}
					
				five--;
				ten++;
				}else {
					if(ten>0 && five>0) {
						five--;
						ten--;
					}
					else if(five>=3) {
						five-=3;
					}else {
						possible=false;
						break;
					}
			}
		}
		System.out.println(possible);
		sc.close();
			
		
		}
		
	}



