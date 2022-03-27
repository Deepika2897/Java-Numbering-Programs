//1-2+3-4+5-6+7-8+9-10
package com.edu;

public class ForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=1;
int sum=0;
for(i=1;i<=10;i++)
{
	if(i%2==0)
	{
		sum=sum-i;
	}
	else
	{
	sum=sum+i;
	
	}}
System.out.println("series of sum"+sum);
}
}