package MapmyIndia;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int m=sc.nextInt();
	int[]arr1=new int[m];
	for(int i=0;i<m;i++) {
		arr1[i]=sc.nextInt();
	}
	int n=sc.nextInt();
	int []arr2=new int [n];

for(int i=0;i<n;i++) {
	arr2[i]=sc.nextInt();
}
mergeSort(arr1,arr2,m,n);

}

public static void mergeSort(int[] arr1, int[] arr2, int m, int n) {
	int[]ans=new int[m+n];
	int i=0;
	int idx1=0;
	int idx2=0;
	
	while(idx1<arr1.length && idx2<arr2.length) {
		if(arr1[idx1]<arr2[idx2]) {
			ans[i]=arr1[idx1];
			idx1++;
			i++;
		}else {
			ans[i]=arr2[idx2];
			i++; idx2++;
			
		}
	}
	while(idx1<arr1.length) {
		ans[i]=arr1[idx1];
		idx1++;
		i++;
	}
	while(idx2<arr2.length) {
		ans[i]=arr2[idx2];
		idx2++;
		i++;
	}
	System.out.println(Arrays.toString(ans));
}
}
