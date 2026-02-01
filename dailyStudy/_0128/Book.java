package dailyStudy._0128;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Book {

//	4개 접근제어   default 패키지 내부
//				protected 패키지 + 상속
//				private 본인 멤버~
//				public 

	static int count = 0;
	static int totalCount = 0;

	// 기능 구현하기 xx -->> 실제 프로그램처럼 구현 추가하기.
	// Book Array 를 무한하게 받을 수 있는 로직.
	int idx; // 도서번호(고객이 볼 수 있는 번호) 추가 하기. idx 1~2~3~
	String uniqueIdx; // 고유번호 날짜 + RANDOM 3 자리 + index 001++ (날자 변경시엔 index 001로 초기화)
	String title; // 책의제목명
	String author; // 책의작가명
	String company; // 책의출판사
	LocalDate regDate; // 책등록일자
	String rentMember; // 책빌린멤버 Member
	String rentSetDate; // 책빌려간날 대여일 ~~
	String rentGetDate; // 책반납할날 반납일 ~~ System.date == 온라인 도서관 자동 반납처리.

	private Book() {
	} // 사용금지

//	도서 등록시 생성자
	public Book(String title, String author, String company) throws IOException {

		
		this(title,author,company,LocalDate.now(),null,null,null);
		
		
		
		
		

//		this.title = title;
//		this.author = author;
//		this.company = company;
//		this.regDate = LocalDate.now();
//		this.rentMember = null; // 화면 ID + //권한 부여
//		this.rentSetDate = null;
//		this.rentGetDate = null;
//
//		

	}

//	DB 등록시 생성자
	public Book(String title, String author, String company, LocalDate regDate, String rentMember, String rentSetDate,String rentGetDate) throws IOException {
		
		dayForCount();
		this.totalCount++;
		this.idx = totalCount;
		this.uniqueIdx = dayForAddBookCount();
		
		
		this.title = title;
		this.author = author;
		this.company = company;
		this.regDate = regDate;
		this.rentMember = rentMember;
		this.rentSetDate = rentSetDate;
		this.rentGetDate = rentGetDate;

	}

	public static String dayForAddBookCount() throws IOException {

		LocalDate today = LocalDate.now();
		
		String tempdate = "" + (LocalDate.now().getDayOfMonth() < 10 ? "0" + LocalDate.now().getDayOfMonth()
				: LocalDate.now().getDayOfMonth());
		String tempRdn = "" + (int) (Math.random() * 1000);
		for (int i = tempRdn.length(); i < 3; i++) {
			tempRdn = "0" + tempRdn;
		}
		
		BufferedReader br = new BufferedReader(new FileReader(today + "count.txt"));
		String todayNumber = Integer.toString(br.read());
		
		return tempdate + tempRdn + todayNumber;

	}

	public static void dayForCount() throws IOException {

		LocalDate today = LocalDate.now();
		BufferedWriter bw = new BufferedWriter(new FileWriter(today + "count.txt", false));
		BufferedReader br = new BufferedReader(new FileReader(today + "count.txt"));

		File file = new File(today + "count.txt");

		if (file.exists()) {
			br.read();
			br.close();
		} else {
			Book.count = 0;
			file.createNewFile();
		}

		Book.count++;

		bw.write(count);
		bw.flush();
		bw.close();

	}

}
