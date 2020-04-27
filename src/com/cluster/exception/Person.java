package com.cluster.exception;

public class Person {

	public static void main(String[] args) {
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		try {
			if (age <18 || age>60)
				throw new MyException("Please check the input");
		} catch (MyException exp) {
			System.out.println(exp);
		}

	}
}
