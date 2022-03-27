/*ARMSTRONG NUMBER
A positive integer whose sum of digits of its CUBE is equal to the number itself is called a armstrong  number.
*/

/*153: 1(POW)3 + 5(POW)3 + 3(POW)3 = 1 + 125+ 27 = 153

125: 1(POW)3 + 2(POW)3 + 5(POW)3 = 1 + 8 + 125 = 134 (Not an Armstrong Number)

1634: 1(POW)4 + 6(POW)4 + 3(POW)4 + 4(POW)4 = 1 + 1296 + 81 + 256 = 1643 */

package com.edu;//153

import java.util.Scanner;

public class ArmstrongNumber {

	static void ArmstrongNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
int n=sc.nextInt();
int n1=n;//for comparision purpose
int d;
int sum=0;
while(n!=0)
{                
	d=n%10;      
	sum=sum+(d*d*d); //or use sum=sum+(int)Math.pow(d,3)
    n=n/10; 
}

if(n1==sum)
{
System.out.println("ArmstrongNumber");
}
else
{
	System.out.println("Not a ArmStrongNumber");
}

}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	ArmstrongNumber.ArmstrongNumber();
}

}

	