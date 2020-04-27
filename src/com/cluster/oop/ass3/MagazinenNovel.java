package com.cluster.oop.ass3;

public class MagazinenNovel {

	public static void main(String[] args) {
		Book b1=new Magazine(1000, "Magazin", 100, "College Magazine");
		((Magazine) b1).display();
		b1=new Novel(1009, "Novel", 200, "ABC");
		((Novel) b1).display();
	}

}
