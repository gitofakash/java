package com.cluster.jvm;

public class Factorial {
	public static void main(String[] args) {
		Factorial obj = new Factorial();
		System.out.println(obj.fact(5));
	}

	public int fact(int n) {
		if (n == 1)
			return 1;
		else
			return n * fact(n - 1);

	}
}
