package demo;
import java.util.Scanner;

//You are given an array, You have to choose a contiguous subarray of length ‘k’, and find the minimum of that segment, return the maximum of those minimums.
//Sample Input:
//1 →  Length of segment x =1
//5 →  size of space n = 5
//1 → space = [ 1,2,3,1,2]
//2 
//3 
//1 
//2 
//Sample Output: 3 -hex10


public class MINofMAX_h {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//k val in sliding win
		int k=sc.nextInt();
		
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int answer=Integer.MIN_VALUE;
		//win reading with k size 
		for(int i=0;i<=n-k;i++) {
			int min=arr[i];
		
		//find min in current win
			for(int j=i;j<i+k;j++) {
				if(min<arr[j]) {
					min=arr[j];
				}
				
			}
			//updating
			if(min>arr[i]) {
				answer=min;
				
			}
			
			
		}
		System.out.println(answer);
		sc.close();
		
	}

}
