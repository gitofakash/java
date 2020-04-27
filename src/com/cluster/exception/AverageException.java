package com.cluster.exception;

import java.util.Scanner;

public class AverageException {
	public static void main(String[] args) {
		String[] name = new String[2];
		int sub1=0, sub2=0, sub3=0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter the name of student :");
		
			try {
				name[i] = sc.next();

				System.out.println("Enter the marks of student - " + name[i] + " : ");
				if (sc.hasNextInt())
					sub1 = sc.nextInt();
				else
					throw new NumberFormatException();

				if (sc.hasNextInt())
					sub2 = sc.nextInt();
				else
					throw new NumberFormatException();
				
				if (sc.hasNextInt())
					sub3 = sc.nextInt();
				else
					throw new NumberFormatException();

			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("Average of student1 : "+((sub1+sub2+sub3)/3));
		}
		sc.close();

	}

}
