package dailyStudy._0117;

public class Book {

	String title;
	String author; //저자
	int price;
	int pages;
	String company; //출판사
	
	Book(String title, String author, int price, int pages, String company) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.pages = pages;
		this.company = company;
	}
	
	Book(String title, String author) {
		this(title, author, 30000, 256, "청어람");
	}
	
	Book(String title, String author, String company) {
		this(title, author, 25000, 170, company);
	}
	
	Book(String title) {
		this(title, "조앤케이롤링");
	}
	
	Book() {
		this("HarryPotter");
	}
	
	void showBooke() {
		System.out.println("도서명 : " +title);
		System.out.println("저자명 : " +author);
		System.out.println("가격 : " +price);
		System.out.println("페이지수 : " +pages);
		System.out.println("출판사 : " +company);
		System.out.println("*****************");
		
	}
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("해리포터");
		Book book3 = new Book("벽오금악도", "이외수");
		Book book4 = new Book("카스테라","박민규","문학동네");
		Book book5 = new Book("옥탑방고양이","김유리",13000,280,"키스더북스");
		
		book1.showBooke();
		book2.showBooke();
		book3.showBooke();
		book4.showBooke();
		book5.showBooke();
	}
	
}
