package com.edu;
//ReverseNumberCheckPalindrome
import java.util.Scanner;

public class Palindrome {
static void Palindrome()
{
	Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number");
	int n=sc.nextInt();
	int n1=n;//for comparision purpose
	int d,rev=0;
	while(n!=0)
	{                //n=123                    n=12                 n=1
		d=n%10;      //d=3                      d=2                  d=1
		rev=rev*10+d;//rev=0*10+33              rev=3*10+2=32        rev=32*10+1=321
		n=n/10;      //123/10=12                12/10=1              1/10=0
	}
	System.out.println("Reversed number="+rev);
	if(n1==rev)
	{
	System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not a palindrome");
	}
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome.Palindrome();
	}

}
