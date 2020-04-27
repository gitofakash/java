package com.cluster.exception;

import java.util.Scanner;

public class Average_Assgn3 {
	public static void main(String[] args) {
		int marks[]=new int[5];
		int sum=0;
		Scanner sc = new Scanner(System.in);
		try {
			for(int i=0;i<5;i++) {
				marks[i]=sc.nextInt();
				sum=sum+marks[i];
				
			}
			System.out.println("Average of enteredS nos : "+(sum/5));
			System.out.println("Enter array index to get the value:");
			int index = sc.nextInt();
			System.out.println("The array element at index " + index + " = " + marks[index]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");		}
		
	}

}
