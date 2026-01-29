package _0127;

public class LibrarySystem {

	public static void main(String[] args) {

		Book b1 = new Book();
		Book b2 = new Book("자바");
		Book b3 = new Book("자료구조", 15000);
		Book b4 = new Book("운영체제", -5000);
		

		System.out.println();
		b1.printInfo();
		b2.printInfo();
		b3.printInfo();
		b4.printInfo();
		
		System.out.println();
		System.out.println("총 생성된 Book 수 : " + Book.totalBooks);

	}

}
