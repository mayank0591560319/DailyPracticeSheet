package MapmyIndia;

import java.util.Scanner;

public class Fibonaaci {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	fibo(n);
	fibonacciSeries(n);
	
}

public static void fibonacciSeries(int n) {
	for(int i=0;i<100;i++) {
		System.out.println(fibo(i));
		
	}
}

public static int fibo(int n) {
	
	
	if(n<=1) {
		return n;
	}
	
	int sp1=fibo(n-1);
	int sp2=fibo(n-2);
	
	return sp1+sp2;
	
}
}
