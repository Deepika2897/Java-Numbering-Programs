package com.edu;
//finding the sumofdigits using loops

import java.util.Scanner;

public class SumOfDigits {
	static void SumOfDigits()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int d,s=0;
		int count=0;
		while(n!=0)
		{
			d=n%10;
			System.out.print(d);
			s=s+d;
			n=n/10;
			count=count+1;
			
		}
		System.out.println("\nSum of Digits"+s);
		System.out.println("Number of Digits"+count);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SumOfDigits.SumOfDigits();
	}

}
