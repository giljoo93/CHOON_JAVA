package dailyStudy._0123;

import java.time.LocalDate;

public class Book {

	String title;
	String author;
	String company;
	LocalDate regDate;
	String rentMember;
	String rentDate;

	
	public Book() {
		
	}
	
//	도서 등록 메서드에 사용될 생성자
	public Book(String title, String author, String company) {
		this.title = title;
		this.author = author;
		this.company = company;
		this.regDate = LocalDate.now();
		this.rentMember = null;
		this.rentDate = null;
		
	}
	
//	DB를 읽어 올 때, ArrayList에 등록하기 위한 생성자
	public Book(String title, String author, String company, String regDate, String rentMember, String rentDate) {
		this.title = title;
		this.author = author;
		this.company = company;
		this.regDate = LocalDate.parse(rentDate);
		this.rentMember = (rentMember != null ? rentMember : "대여자 없음");
		this.rentDate = (rentDate != null ? rentDate : "대여일 없음");
	}
	
	
//	한줄로 표기를 위한 Override
	@Override
	public String toString() {
		return	  title + " / " 
				+ author + " / " 
				+ company + " / " 
				+ regDate + " / "
				+ (rentMember != null ? rentMember : "대여자 없음") + " / " 
				+ (rentDate != null ? rentDate : "대여일 없음");
	}
	
}