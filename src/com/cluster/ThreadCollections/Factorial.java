package com.cluster.ThreadCollections;

public class Factorial {

	public static void main(String[] args) {
		NumberThread obj1 = new NumberThread();
		FactorialThread obj2 = new FactorialThread();
		obj1.start();
		obj2.start();

	}

}

class NumberThread extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Number : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class FactorialThread extends Thread {
	public void run() {
		for (int n = 0; n <= 5; n++) {
			int fac = 1;
			if (n == 0) {
				System.out.println("Factorial  of " + n + " : 1");
			} else {
				for (int i = 1; i <= n; i++) {
					fac = fac * i;
				}
				System.out.println("Factorial  of " + n + " : " + fac);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
