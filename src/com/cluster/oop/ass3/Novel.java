package com.cluster.oop.ass3;

public class Novel extends Book {
	String author;

	public Novel(int isbn, String title, double price, String author) {
		super(isbn, author, price);
		this.author = author;
	}

	public void display() {
		System.out.println("\nNovel author=" + author + ", isbn=" + isbn + ", title=" + title + ", price=" + price);
	}

}
