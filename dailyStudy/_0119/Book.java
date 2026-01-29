package dailyStudy._0119;

import java.io.*;
import java.time.LocalDate;


public class Book extends LibrarySystem {
	String title; // 제목
	String author; // 작가
	LocalDate regDate; // 등록일
	LocalDate rentDate; // 대여일
	String rentUserInfo; // 대여자정보
	String donor; // 증여자

	// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//	default 생성자
	Book() {

	}

//	책을 등록 시 사용될 생성자. 책제목/작가명/등록일자(자동등록)/증여자명
	Book(String title, String author, String donor) {
		this.title = title;
		this.author = author;
		this.regDate = LocalDate.now();
		this.donor = donor;
		this.rentUserInfo = null;
		this.rentDate = null;
	}

//	txt 파일과 주고 받기 위한 생성자
	Book(String title, String author, String donor, String regDate, String rentUserInfo, String rentDate) {
		this.title = title;
		this.author = author;
		this.donor = donor;
		this.regDate = LocalDate.parse(regDate);
		this.rentUserInfo = rentUserInfo;
		if (rentDate != null && !rentDate.equals("대여일 없음")) {
			this.rentDate = LocalDate.parse(rentDate);
		} else {
			this.rentDate = null;
		}
	}

	@Override
	public String toString() {
		return title + " / " + author + " / " + donor + " / " + regDate + " / "
				+ (rentUserInfo != null ? rentUserInfo : "대여자 없음") + " / " + (rentDate != null ? rentDate : "대여일 없음");
	}

	public void addBook() {

		
		System.out.println("도서 등록 페이지입니다.");
		System.out.println("띄워쓰지말고 정보를 입력하세요.");
		System.out.print("도서명 : ");
		String title = LibrarySystem.userInput.next();
		System.out.print("저자명 : ");
		String author = userInput.next();
		System.out.print("증여자명 : ");
		String donor = userInput.next();

		Book temp = new Book(title, author, donor);
		bookList.add(temp);
	
	}

	public void deletebook() throws IOException {
		System.out.println("도서 삭제 페이지입니다.");
		System.out.println("삭제할 도서의 인덱스 번호를 입력하세요.");
		int delIdx = userInput.nextInt();
		bookList.remove(delIdx);

	}

//	bookList의 인덱스를 보여주는 작업
	public void showBook() {
		for (int idx = 0; idx < bookList.size(); idx++) {
			System.out.println(idx + " " + bookList.get(idx));
		}
	}

//	bookList의 인덱스를 notepad_DB에 저장하는 작업
	public void saveDB() throws IOException {
		BufferedWriter SDBW = new BufferedWriter(new FileWriter("bookList.txt", false));
		for (Book i : bookList) {
			SDBW.write(i + "\n");
			SDBW.flush();

		}
		SDBW.close();
	}

//	bookList.txt의 DB를 ArrayList<Book> bookList에 등록하는 작업.	
	public void readDB() throws IOException {
		bookList.clear();
		BufferedReader fr = new BufferedReader(new FileReader("bookList.txt"));
		for (String Line = fr.readLine(); Line != null; Line = fr.readLine()) {
			String[] parts = Line.split("/");
			Book temp = new Book(parts[0].trim(), // title
					parts[1].trim(), // author
					parts[2].trim(), // donor
					parts[3].trim(), // regDate
					(parts.length > 4 ? parts[4].trim() : null), (parts.length > 5 ? parts[5].trim() : null));
			bookList.add(temp);

		}
		fr.close();
	}

}
