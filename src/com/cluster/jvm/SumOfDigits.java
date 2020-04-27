package com.cluster.jvm;

public class SumOfDigits {

	public static void main(String[] args) {
		//Scanner sc=new 
		int num=3629;
		int rem=0,sum=0;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("The sum of all the digits entered is : " +sum);
	}

}
