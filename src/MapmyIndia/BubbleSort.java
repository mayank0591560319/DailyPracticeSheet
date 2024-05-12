package MapmyIndia;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[]arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("UnsortedArray"+Arrays.toString(arr));
	bubbleSort(arr,n);
}

public static void bubbleSort(int[] arr, int n) {
	for(int count=1;count<=arr.length-1;count++) {
		for(int s=0;s<=arr.length-2;s++) {
			if(arr[s]>arr[s+1]) {
				int temp=arr[s];
				arr[s]=arr[s+1];
				arr[s+1]=temp;
			}
		}
	
	}
	System.out.println("sortedArray"+Arrays.toString(arr));
	
}
}
