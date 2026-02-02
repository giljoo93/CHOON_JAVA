package dailyStudy._0128;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

// Module + View + Control (MVC 패턴)
public class Library {
	static Scanner input = new Scanner(System.in);
	Book[] bookList= new Book[100];
	Book trash;
	String signStatus,mainStatus;

	public static void main(String[] args) throws IOException {
		Library basic = new Library();
		int signMenu, libraryMenu, sortShowMenu;
		boolean library, sortShow;

		while (true) {
			Tool.clearScreen();
			
			System.out.println("============================");
			System.out.println("사이버 도서관에 오신 것을 환영합니다.");
			System.out.println("원하시는 메뉴를 선택하세요.");
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("0.종료");
			System.out.println("============================");
			System.out.println(basic.signStatus != null ? "System : " + basic.signStatus : "System : 방문을 환영합니다.");
			System.out.println("----------------------------");
			System.out.print(">");
			
			signMenu = input.nextInt();

			switch (signMenu) {

			case 1: // 1.로그인

				library = true;
				while (library) {
					basic.signStatus = null;
					Tool.clearScreen();
					System.out.println("============================");
					System.out.println("ㅇㅇㅇ" + "님 환영합니다."); // 추후 멤버에서 멤버명을 대체 할 계획
					System.out.println("사이버 도서관입니다.");
					System.out.println("1.도서찾기");
					System.out.println("2.도서대여");
					System.out.println("3.도서반납");
					System.out.println("4.도서추가");
					System.out.println("5.도서삭제");
					System.out.println("6.도서복구");
					System.out.println("0.로그아웃");
					System.out.println("============================");
					System.out.println(basic.mainStatus != null ? "System : " + basic.mainStatus : "System : 방문을 환영합니다.");
					System.out.println("----------------------------");
					System.out.print(">");
					
					libraryMenu = input.nextInt();
					switch (libraryMenu) {
					case 1: // 1.도서조회

						sortShow = true;
						while (sortShow) {

							Tool.clearScreen();
							
							System.out.println("============================");
							
							System.out.println("도서조회 페이지입니다.");
							System.out.println("1.도서조회");
							System.out.println("2.도서명정렬");
							System.out.println("3.작가명정렬");
							System.out.println("4.출판사명정렬");
							System.out.println("0.돌아가기");
							System.out.println("============================");
							System.out.println(basic.mainStatus != null ? "System : " + basic.mainStatus : "System : 방문을 환영합니다.");
							System.out.println("----------------------------");
							System.out.print(">");
							
							sortShowMenu = input.nextInt();
							switch (sortShowMenu) {
							case 1: // 조회
								basic.readDB();
								Tool.clearScreen();
								basic.showBook();
								break;
							case 2: // 도서명정렬
								basic.sort(sortShowMenu);
								basic.writeDB();
								break;
							case 3: // 작가명정렬
								basic.sort(sortShowMenu);
								basic.writeDB();
								break;
							case 4: // 출판사명정렬
								basic.sort(sortShowMenu);
								basic.writeDB();
								break;
							case 0:
								sortShow = false;
								break;
							}
						}

						break;
					case 2: // 2.도서대여
						break;
					case 3: // 3.도서반납
						break;
					case 4: // 4.도서추가
						
						basic.readDB();
						Tool.clearScreen();
						basic.addBook();
						basic.writeDB();						
						Tool.extendBookSize(basic.bookList);
						basic.readDB();

						// 도서 저장을 안하면, 자료저장이 안되게끔
						// 도서 저장 / 불러오기 기능을 만들기.
						
						break;
					case 5: // 5.도서삭제
						basic.readDB();
						basic.deleteBook();
						basic.writeDB();
						break;
					case 6: // 6.도서복구
						basic.readDB();
						basic.recoverBook();
						basic.writeDB();
						break;
					case 0: // 0.로그아웃
						library = false;
						break;
					}

				}
				break;

			case 2: // 2.회원가입
				basic.signStatus = "회원가입이 완료되었습니다.";
				break;

			case 0: // 3.종료
				Tool.clearScreen();
				System.out.println("프로그램을 종료합니다.");
				return;

			} // 메뉴 스위치-케이스 문 종료
		} // 프로그램 전체 반복문 종료
	} // 메인 메서드

//	로그인 로직 ---------------------------------------------------------------------------------------

//	출력 로직-----------------------------------------------------------------------------------------	

	public void showBook() {
		
		for (int i = 0; i < bookList.length; i++) {
			if (bookList[i] != null) {
				System.out.printf("도서번호:%d 도서명:%s 저자명:%s 출판사:%s 등록일:%s 대여자명:%s 대여일:%s 반납일:%s\n",
						i, bookList[i].title, bookList[i].author, bookList[i].company, bookList[i].regDate,
						   bookList[i].rentMember, bookList[i].rentSetDate, bookList[i].rentGetDate);

			} else {
				break;
			}
		}
		System.out.println("이전페이지로 돌아가려면 0을 입력해주세요.");
		boolean number = true;

		while (number) {
			input.nextLine(); // 개행 제거
			int num = input.nextInt();
			if (num == 0) {
				number = false;
			}
		}

	}

//	정렬 로직------------------------------------------------------------------------------------------	

	public void sort(int KoS) {
		int realIdx = 100;
		int minIdx, maxIdx, choice;
		Book temp;
		for (int i = 0; i < bookList.length; i++) { // bookList 배열의 실제 사이즈 확인
			if (bookList[i] == null) {
				realIdx = i;
				break;
			}
		}
		Tool.clearScreen();
		System.out.println("[정렬]");
		System.out.println("1.오름차순 정렬 2.내림차순 정렬");
		choice = input.nextInt();
		switch (choice) {
		case 1:
			for (int i = 0; i < realIdx - 1; i++) {
				minIdx = i;
				for (int j = i + 1; j < realIdx; j++) {
					if ((KoS == 2 ? bookList[minIdx].title
					  : (KoS == 3 ? bookList[minIdx].author
					  : (KoS == 4 ? bookList[minIdx].company
					  : ""))).compareTo(
						(KoS == 2 ? bookList[j].title
					  : (KoS == 3 ? bookList[j].author
					  : (KoS == 4 ? bookList[j].company 
					  : " ")))  ) >0
						) {
						minIdx = j;
					}
				}

				temp = bookList[i];
				bookList[i] = bookList[minIdx];
				bookList[minIdx] = temp;

			}
			this.mainStatus = (KoS == 2 ? "책제목으로 오름차순 정렬을 완료했습니다."
							: (KoS == 3 ? "작가명으로 오름차순 정렬을 완료했습니다."
							: (KoS == 4 ? "출판사명으로 오름차순 정렬을 완료했습니다."
							: "")));
			break;

		case 2:
			for (int i = 0; i < realIdx - 1; i++) {
				maxIdx = i;
				for (int j = i + 1; j < realIdx; j++) {
					if ((KoS == 2 ? bookList[maxIdx].title
					  : (KoS == 3 ? bookList[maxIdx].author 
					  : (KoS == 4 ? bookList[maxIdx].company 
					  : ""))).compareTo( 
						(KoS == 2 ? bookList[j].title
					  : (KoS == 3 ? bookList[j].author 
					  : (KoS == 4 ? bookList[j].company
					  : "")))) <0 
						) {
						maxIdx = j;
					}
				}
				temp = bookList[i];
				bookList[i] = bookList[maxIdx];
				bookList[maxIdx] = temp;

			}
			this.mainStatus = (KoS == 2 ? "책제목으로 내림차순 정렬을 완료했습니다."
							: (KoS == 3 ? "작가명으로 내림차순 정렬을 완료했습니다."
							: (KoS == 4 ? "출판사명으로 내림차순 정렬을 완료했습니다."
							: "")));
			break;
		}
	}

//	도서관리 로직---------------------------------------------------------------------------------------	

	public void addBook() throws IOException {
		
		System.out.println("도서 추가 페이지입니다.");
		System.out.println("추가 할 도서의 도서명을 입력하세요.");
		input.nextLine(); // 개행 제거
		String title = input.nextLine();
		System.out.println("추가 할 도서의 작가명을 입력하세요.");
		String author = input.nextLine();
		System.out.println("추가 할 도서의 출판사명을 입력하세요.");
		String company = input.nextLine();
		Book addbook = new Book(title, author, company);
		addBookList(addbook);
		addbook = null;
	}

	public void addBookList(Book addbook) {
		
//		여러권을 동시에 추가 할 수 있게끔.
		
		for (int i = 0; i < bookList.length; i++) {
			if (bookList[i] == null) {
				bookList[i] = addbook;
				mainStatus = "온라인 책장에 새 도서를 추가했습니다.";
				break;
			}
		}
	}

	public void deleteBook() {
		
//		삭제 할 도서 검색 기능
//		검색한 도서의 인덱스 확인 가능하게 >> 삭제로직
		
		
		int idx;
		//99 ~ 100번째 책
		System.out.println("삭제 할 도서의 도서번호를 입력해주세요.");
		idx = input.nextInt();
		this.trash = bookList[idx];
		for (int i = idx; i < bookList.length; i++) {
			if (i < 99 && bookList[i + 1] != null) {
				bookList[i] = bookList[i + 1];
				bookList[i + 1] = null;
			} else { 
				bookList[i] = null;
				break;
			}
		}
		mainStatus = "정상적으로 삭제되었습니다.";
	}

	public void recoverBook() {
		System.out.println("가장마지막으로 잘못 지운 데이터를 복구합니다.");
//	지워준 데이터 보여주는 메서드
		System.out.println("1.복구합니다 0.돌아가기");
		addBookList(trash);
		mainStatus = "정상적으로 복구되었습니다.";

	}

//	DB관리 로직---------------------------------------------------------------------------------------	

	public void writeDB() throws IOException {

		int realIdx = 100;

		for (int i = 0; i < bookList.length; i++) { // bookList 배열의 실제 사이즈 확인
			if (bookList[i] == null) {
				realIdx = i;
				break;
			}  // 배열이 꽉 찼을 때 이유에 대한 리턴 줄 것.
		}

		BufferedWriter fr = new BufferedWriter(new FileWriter("lib_bookDB.txt", false));
		for (int i = 0; i < realIdx; i++) {
			fr.write (bookList[i].title + "/"
					+ bookList[i].author + "/" 
					+ bookList[i].company + "/"
					+ bookList[i].regDate + "/" 
					+ bookList[i].rentMember + "/" 
					+ bookList[i].rentSetDate + "/"
					+ bookList[i].rentGetDate + "\n");
			fr.flush();
		}
		fr.close();
	}

	public void readDB() throws IOException {

		int idx = 0;
		String[] temp;
		Book tempDB;
		BufferedReader fr = new BufferedReader(new FileReader("lib_bookDB.txt"));

		for (int i = 0; i < bookList.length; i++) { // 배열 값 다 지우기
			bookList[i] = null;
		}

		for (String Line = fr.readLine(); Line != null; Line = fr.readLine()) {

			temp = Line.split("/");
			
			
			tempDB = new Book(temp[0], temp[1], temp[2], LocalDate.parse(temp[3]), temp[4], temp[5], temp[6]);
			bookList[idx] = tempDB;
			idx++;
		}
		fr.close();
	}

} // 클래스 메서드
