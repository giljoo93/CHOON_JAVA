package dailyStudy._0123;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
	
	Scanner shortInput = new Scanner(System.in);
	ArrayList<Book> bookArray = new ArrayList<Book>();
	String userHome =System.getProperty("user.home"); //DB저장위한 경로값 확인용
	int permission; // 권한 설정 0 방문자 , 1 일반회원 , 2 관리자

	public static void main(String[] args) throws IOException {


		LibrarySystem user = new LibrarySystem();
		user.permission = 0;
		
//		최초 프로그램 실행시 bookList.txt가 있으면 넘어가고, 없으면 만들어준다.
		
		File dir = new File(user.userHome,"LibrarySystem");
		if (!dir.exists()) {
		    dir.mkdirs(); // 폴더 생성 (필요한 상위 폴더까지 모두)
		}

		File file = new File(dir, "bookList.txt");
		if (!file.exists()) {
		    file.createNewFile(); // 파일 생성
		}
		
		while (true) {

			pushScreen(50);
			System.out.println("도서 관리 시스템입니다.");

//			로그인 페이지에 대한 분기
			switch (user.permission) {
			case 0: // default value
				user.showVisitorMenu(); // 로그인 분기 메서드
				break;
			case 1:
				user.showMemberMenu(); // 도서 대여 관련 메서드
				break;
			case 2:
				user.showAdminMenu(); // 관리자 회원 및 도서 관리 메서드
				break;
			}

		}
	}

//	Basic Structure methods --------------------------------------------------

//	도스 실행시 "\n" 실행해서 화면을 클린하게 만들어주는 메서드
	public static void pushScreen(int number) {
		for (int i = 0; i < number; i++) {
			System.out.println();
		}
	}

//	방문자권한 로그인 페이지
	public void showVisitorMenu() {
		System.out.println("로그인 페이지");
		System.out.println("1.로그인 2.회원가입 0.프로그램 종료");
		int visitorChoice = shortInput.nextInt();

		switch (visitorChoice) {
		case 1:
			signIn(); //로그인 - 일반회원 or 관리자 권한 받아 진입가능
			break;
		case 2:
			signUp(); // 회원가입기능 미구현, 가입성공처리만됨.
			break;
		case 0:
			System.out.println("프로그램을 종료합니다.");
			shortInput.close();
			System.exit(0);
		}
	}

//	멤버 도서 대여 페이지
	public void showMemberMenu() throws IOException {
		System.out.println("도서관 페이지");
		System.out.println("1.도서조회");
		System.out.println("2.도서대여");
		System.out.println("3.도서반납");
		System.out.println("0.로그아웃");
		int memberChoice = shortInput.nextInt();

		switch (memberChoice) {
		case 1:
			pushScreen(30);
			System.out.println("도서목록 조회");

			showBookList(); //도서목록 조회
			break;
		case 2:
//			checkoutBooks(); //
			break;
		case 3:
//			checkinBooks();
			break;
		case 0:
			System.out.println("로그아웃합니다.");
			this.permission = 0;
			break;
		}
	}

//	관리자 페이지
	public void showAdminMenu() throws IOException {
		System.out.println("관리자 페이지");
		System.out.println("1.회원관리");
		System.out.println("2.도서관리");
		System.out.println("0.로그아웃");
		int adminChoice = shortInput.nextInt();

		switch (adminChoice) {
		case 1: //회원 관리에 관한 페이지
			pushScreen(30);
			System.out.println("회원관리");
			System.out.println("1.회원조회");
			System.out.println("2.회원삭제");
			System.out.println("0.돌아가기");
			int MMChoice = shortInput.nextInt();
			switch (MMChoice) {
			case 1:
//				showMemberList();
				break;
			case 2:
//				deleteMember();
				break;
			case 0:

				break;
			}
			break;
		case 2: //도서 관리에 대한 페이지
			pushScreen(30);
			System.out.println("도서관리");
			System.out.println("1.도서추가");
			System.out.println("2.도서삭제");
			System.out.println("0.돌아가기");
			int BMChoice = shortInput.nextInt();
			switch (BMChoice) {
			case 1:
				addBook();
				writeDB();
				break;
			case 2:
				deleteBook();
				break;
			case 0:

				break;
			}

			break;
		case 0: // 로그아웃 페이지
			System.out.println("로그아웃합니다.");
			this.permission = 0;
			break;
		}
	}

//	Login Structure methods --------------------------------------------------

	public void signIn() {
		System.out.println("권한선택 1.사용자 2.관리자");
		int loginChoice = shortInput.nextInt();

		switch (loginChoice) {
		case 1:
			this.permission = 1;
			System.out.println("사용자 로그인에 성공하였습니다.");
			break;
		case 2:
			this.permission = 2;
			System.out.println("관리자 로그인에 성공하였습니다.");
			break;
		}

	}

	public void signUp() {
		System.out.println("회원가입에 성공하였습니다.");
	}

//	Library System Structure methods -----------------------------------------

	public void showBookList() throws IOException {
		System.out.println("등록된 도서 목록입니다.");
		for(Book i : bookArray) {
			output.write(i + "\n");
			output.flush();
		}
		int next = 1;
		while (next == 1) {
		System.out.println("페이지로 돌아가시려면, 0번을 입력하세요.");
		next = shortInput.nextInt();
		if(next ==0) break;
		}
	}
	
	public void addBook() throws IOException {
		pushScreen(30);
		System.out.println("도서 추가 페이지입니다.");
		System.out.println("추가할 도서명을 입력하세요.");
		System.out.print(">");
		String title = shortInput.next();
		System.out.println("도서의 작가명을 입력하세요.");
		System.out.print(">");
		String author = shortInput.next();
		System.out.println("도서의 출판사명을 입력하세요.");
		System.out.print(">");
		String company = shortInput.next();
		
		Book temp = new Book(title, author, company);
		bookArray.add(temp);
		

	}

	public void deleteBook() {

	}
	
//	bookArray[index]들을 bookList.txt 로 저장하는 메서드
	public void writeDB() throws IOException {
		BufferedWriter bw = new BufferedWriter (new FileWriter(userHome +"\\LibrarySystem\\bookList.txt"));
		for(Book i : bookArray) {
			bw.write(i + "\n");
			bw.flush();

		}
		bw.close();
	}
	
	public void readDB() throws IOException {
		BufferedReader br = new BufferedReader (new FileReader(userHome +"\\LibrarySystem\\bookList.txt"));
		for(br.readLine(); br.readLine()!= null; br.readLine()) {
			String temp = br.readLine();
			String[] part = temp.split("/");

		
		}
	}
	
	
	
}
