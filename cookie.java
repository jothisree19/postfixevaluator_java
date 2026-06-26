package demo;
import java.util.Arrays;
import java.util.Scanner;
//import java.util.Scanner.*;
public class cookie {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int [] greed =new int[n];
		for(int i=0;i<n;i++) {
		  greed[i]=sc.nextInt();
			}
		
		int m=sc.nextInt();
		int [] cookies=new int [m];
		for(int i=0;i<m;i++) {
			cookies[i]=sc.nextInt();
		}
		Arrays.sort(greed);
		Arrays.sort(cookies);
		int child=0;
		int choco=0;
		 while(child<n && choco <m) {
			 if(cookies[choco]>greed[child]) {
				 child++;
				 choco++;
			 }else {
				 choco++;
			 }
			 
		 }
		 System.out.println(child);
		 sc.close();
	}

}
