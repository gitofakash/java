package com.cluster.oop;

public class Book {
	int isbn;
	String title, author;
	double price;

	public Book(int isbn, String title, String author, double price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public void displaydetails() {
		System.out.println("\nDetails of Book\nisbn : "+isbn+"\nTitle : "+title+"\nAuthor : "+author+"\nPrice : "+price);

	}
	public double discountedprice(double discount) {
		return price*(discount/100);
		
	}

	public static void main(String[] args) {
		Book obj = new Book(101, "Test", "name", 100.00);
		obj.displaydetails();
		
	}

}
