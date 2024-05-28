package MapmyIndia;

import java.util.Scanner;

public class SlidingWindowConcept {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[]arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int k=sc.nextInt();
	
	System.out.println(slidingWindow(arr,n,k));
}

public static int slidingWindow(int[] arr, int n,int k) {
	int maxSum=0;
	if(n<=k) {
		return -1;
	}
	for(int i=0;i<k;i++) 
		maxSum+=arr[i];
		
		int windowSum=maxSum;
		for(int i=k;i<n;i++) {
			windowSum+=(arr[i]-arr[i-k]);
			maxSum=Math.max(maxSum, windowSum);
		}
		
		
 
	return maxSum;
	
}
}
