package com.edu;

import java.util.Scanner;

public class PrimeNumber {
	

	static void checkPrime() {
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		//to check prime  //check for factors
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			System.out.println(n+" is prime");
		}
		else {
			System.out.println(n+" is not prime");
		}
}
	static void generatePrime() {
		int c=0;
		for(int i=1;i<=100;i++) {
			c=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					c++;
				}
			}
			if(c==2) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		checkPrime();
		generatePrime();
	}

}
