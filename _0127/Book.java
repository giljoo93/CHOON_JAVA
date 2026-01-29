package _0127;

public class Book {

	private String title;
	private int price;
	
	static int totalBooks;
	
	Book() {
		totalBooks++;
		System.out.println("default Constructor create by a new Book");
	}

	Book(String title) {
		this.title = title;
		this.price = 0;
		totalBooks++;
		System.out.println("title Constructors create by a new book");
	}
	
	Book(String title, int price) {
		if(price < 0) {
			System.out.println("price is error! set price by 0");
			this.price = 0;
		} else {
			this.price = price;
		}
		this.title = title;
		totalBooks++;
		System.out.println("create a perfect book");
	}
	
	void printInfo() {
		System.out.println("title : " + title + ", price : " + price);
	}
	
}
