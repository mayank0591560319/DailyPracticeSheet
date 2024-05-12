package MapmyIndia;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseAnArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		reverseArray(arr,n);
	}

	public static void reverseArray(int[] arr, int n) {
		Stack<Integer>S=new Stack<>();
		for(int ele:arr) {
			S.add(ele);
		}
		for(int i=0;i<n;i++) {
			arr[i]=S.pop();
		}
		System.out.println(Arrays.toString(arr));
	}
	

}
