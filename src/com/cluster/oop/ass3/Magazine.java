package com.cluster.oop.ass3;

public class Magazine extends Book {
	String type;

	public Magazine(int isbn, String title, double price, String type) {
		super(isbn, type, price);
		this.type = type;
	}

	public void display() {
		System.out.println("\nMagazine type=" + type + ", isbn=" + isbn + ", title=" + title + ", price=" + price);
	}

}
