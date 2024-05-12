package MapmyIndia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintOddEventInArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[]arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	printOddEven(arr,n);
}

public static void printOddEven(int[] arr, int n) {
	List<Integer>oddElement=new ArrayList<>();
	List<Integer>evenElement=new ArrayList<>();
for(int i=0;i<n;i++) {
	if(arr[i]%2==0) {
		evenElement.add(arr[i]);
		
		
	}else {
		oddElement.add(arr[i]);
		
	}
}
	System.out.println("evenElements:"+evenElement);
	System.out.println("oddElements:"+oddElement);
	
}
}
