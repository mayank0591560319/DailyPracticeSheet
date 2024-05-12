package MapmyIndia;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	
	printPrime(num);
}

public static void printPrime(int num) {
	for(int i=1;i<100;i++) {
		if(isPrime(i)) {
			System.out.println(i);
		}
	}
	
}

public static boolean isPrime(int num) {
	int div=1;int factor=0;
    while(div<=num) {
    	if(num%div==0) {
    		factor++;
    	}
	div++;
     }
    if(factor==2) {
    	return true;
    }
	return false;
}
}
