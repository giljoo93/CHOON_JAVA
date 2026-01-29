package dailyStudy._0126;

import java.time.LocalDate;

public class Book {
	
//	4개 접근제어   default 패키지 내부
//				protected 패키지 + 상속
//				private 본인 멤버~
//				public 
	
	

						// *.java 를 ~ 읽어서.
						// ++ 하나의 소스 코드를 읽어서, 소스 코드 분석기. 
						// public,private,protected,String int float double
						// this =  사용된 단어들이 몇개씩 사용됐는지를 카운트하는 프로그램.
	
	
						//기능 구현하기 xx -->> 실제 프로그램처럼 구현 추가하기.
						//Book Array 를 무한하게 받을 수 있는 로직.
						//도서번호(고객이 볼 수 있는 번호) 추가 하기. idx 1~2~3~

	 int	   idx; 		//고유번호 날짜 + RANDOM 3 자리 + index 001++ (날자 변경시엔 index 001로 초기화)
	 String title;		//책의제목명
	 String author;		//책의작가명
	 String company;		//책의출판사
	 LocalDate regDate;	//책등록일자
	 String rentMember;  //책빌린멤버	Member
	 String rentSetDate; //책빌려간날	대여일 ~~
	 String rentGetDate; //책반납할날	반납일 ~~ System.date == 온라인 도서관 자동 반납처리.


	public Book() {}
	
//	도서 등록시 생성자
	public Book(String title, String author, String company) {
		
		this(title,author,company,LocalDate.now(),null,null,null);


		
		
	}
	
//	DB 등록시 생성자
	public Book(String title, String author, String company, LocalDate regDate, String rentMember, String rentSetDate, String rentGetDate) {
		this.title = title;
		this.author = author;
		this.company = company;
		this.regDate = regDate;
		this.rentMember = rentMember;
		this.rentSetDate = rentSetDate;
		this.rentGetDate = rentGetDate;
		
	}
}


