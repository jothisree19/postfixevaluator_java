package demo;
import java.util.HashSet;
import java.util.Scanner;
//import java.util.Scanner.*;

//hex-The principal has a problem with repetitions. Every time someone sends the same email twice he becomes angry and starts yelling. His assistant filters the mails so that all the unique mails are sent only once, and if someone is sending the same mail again and again, he deletes them. Write a program that will see the list of roll numbers of the student and find how many emails are to be deleted.

//Sample Input:  6,  [ 1, 3, 3, 4, 3, 3 ]
//Sample Output: 3  hexware question

public class Duplicatecheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			
			int n=sc.nextInt();
			HashSet<Integer> set =new HashSet<>();
			int deleted = 0;
			for(int i=0;i<n;i++) {
				int roll=sc.nextInt();
				if(set.contains(roll)) {
					deleted++;
				}
					else {
						set.add(roll);
					}
				}
				System.out.println(deleted);
				sc.close();
				
		}
	
			
		}



