package dailyStudy;

import java.util.Scanner;

public class _0116_sort {
	static Scanner input = new Scanner(System.in);
	static Book[] bookArray = new Book[100];	// 도서 배열
	static int bookCount = 0;					// 현재 등록된 도서 수

	public static void main(String[] args) {
		// 초기 도서 데이터 추가 (테스트용)
		addInitialBooks();
		
		while (true) {
			System.out.println("\n=== 도서관리 프로그램 ===");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 관리자페이지");
			System.out.println("0. 종료");
			System.out.print("선택: ");
			
			int menu = input.nextInt();
			input.nextLine(); // 버퍼 비우기
			
			switch (menu) {
			case 1:
				userMenu();
				break;
			case 2:
				register();
				break;
			case 3:
				adminMenu();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
			}
		}
	}

	// 초기 도서 데이터 추가
	public static void addInitialBooks() {
		addBook("자바의 정석", "남궁성", "2024-01-01");
		addBook("이것이 자바다", "신용권", "2024-01-02");
		addBook("혼자 공부하는 자바", "신용권", "2024-01-03");
	}

	// 회원가입
	public static void register() {
		System.out.println("\n=== 회원가입 ===");
		System.out.print("이름을 입력하세요: ");
		String name = input.nextLine();
		System.out.print("전화번호를 입력하세요: ");
		String phone = input.nextLine();
		System.out.println(name + "님, 회원가입이 완료되었습니다!");
	}

	// 사용자 메뉴
	public static void userMenu() {
		System.out.println("\n=== 사용자 메뉴 ===");
		
		while (true) {
			System.out.println("\n1. 도서조회");
			System.out.println("2. 도서대여");
			System.out.println("3. 도서반납");
			System.out.println("0. 이전메뉴");
			System.out.print("선택: ");
			
			int menu = input.nextInt();
			input.nextLine(); // 버퍼 비우기
			
			switch (menu) {
			case 1:
				showAllBooks();
				break;
			case 2:
				rentBook();
				break;
			case 3:
				returnBook();
				break;
			case 0:
				return;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
	}

	// 관리자 메뉴
	public static void adminMenu() {
		System.out.println("\n=== 관리자 페이지 ===");
		
		while (true) {
			System.out.println("\n1. 도서추가");
			System.out.println("2. 도서삭제");
			System.out.println("3. 전체도서목록");
			System.out.println("4. 대여중인 도서목록");
			System.out.println("0. 이전메뉴");
			System.out.print("선택: ");
			
			int menu = input.nextInt();
			input.nextLine(); // 버퍼 비우기
			
			switch (menu) {
			case 1:
				addBook();
				break;
			case 2:
				deleteBook();
				break;
			case 3:
				showAllBooks();
				break;
			case 4:
				showRentedBooks();
				break;
			case 0:
				return;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
	}

	// 도서 추가 (사용자 입력)
	public static void addBook() {
		if (bookCount >= bookArray.length) {
			System.out.println("도서 저장 공간이 가득 찼습니다.");
			return;
		}
		
		System.out.println("\n=== 도서 추가 ===");
		System.out.print("책 제목: ");
		String title = input.nextLine();
		System.out.print("저자명: ");
		String author = input.nextLine();
		System.out.print("등록일 (예: 2024-01-16): ");
		String registerDate = input.nextLine();
		
		bookArray[bookCount] = new Book(title, author, registerDate);
		bookCount++;
		System.out.println("도서가 추가되었습니다!");
	}

	// 도서 추가 (오버로딩 - 직접 데이터 입력)
	public static void addBook(String title, String author, String registerDate) {
		if (bookCount >= bookArray.length) {
			return;
		}
		bookArray[bookCount] = new Book(title, author, registerDate);
		bookCount++;
	}

	// 도서 삭제
	public static void deleteBook() {
		if (bookCount == 0) {
			System.out.println("등록된 도서가 없습니다.");
			return;
		}
		
		showAllBooks();
		System.out.print("\n삭제할 도서 번호를 입력하세요: ");
		int index = input.nextInt() - 1;
		input.nextLine();
		
		if (index < 0 || index >= bookCount) {
			System.out.println("잘못된 번호입니다.");
			return;
		}
		
		// 삭제할 도서가 대여중인지 확인
		if (!bookArray[index].isAvailable()) {
			System.out.println("대여중인 도서는 삭제할 수 없습니다.");
			return;
		}
		
		// 배열에서 삭제 (뒤의 요소들을 앞으로 이동)
		for (int i = index; i < bookCount - 1; i++) {
			bookArray[i] = bookArray[i + 1];
		}
		bookArray[bookCount - 1] = null;
		bookCount--;
		System.out.println("도서가 삭제되었습니다.");
	}

	// 전체 도서 목록 조회
	public static void showAllBooks() {
		if (bookCount == 0) {
			System.out.println("\n등록된 도서가 없습니다.");
			return;
		}
		
		System.out.println("\n=== 전체 도서 목록 ===");
		for (int i = 0; i < bookCount; i++) {
			System.out.println((i + 1) + ". " + bookArray[i].toString());
		}
	}

	// 대여중인 도서 목록
	public static void showRentedBooks() {
		boolean hasRented = false;
		System.out.println("\n=== 대여중인 도서 목록 ===");
		
		for (int i = 0; i < bookCount; i++) {
			if (!bookArray[i].isAvailable()) {
				System.out.println((i + 1) + ". " + bookArray[i].toString());
				hasRented = true;
			}
		}
		
		if (!hasRented) {
			System.out.println("대여중인 도서가 없습니다.");
		}
	}

	// 도서 대여
	public static void rentBook() {
		if (bookCount == 0) {
			System.out.println("등록된 도서가 없습니다.");
			return;
		}
		
		// 대여 가능한 도서만 표시
		System.out.println("\n=== 대여 가능한 도서 목록 ===");
		int availableCount = 0;
		int[] availableIndex = new int[bookCount];
		
		for (int i = 0; i < bookCount; i++) {
			if (bookArray[i].isAvailable()) {
				availableIndex[availableCount] = i;
				System.out.println((availableCount + 1) + ". " + bookArray[i].toString());
				availableCount++;
			}
		}
		
		if (availableCount == 0) {
			System.out.println("대여 가능한 도서가 없습니다.");
			return;
		}
		
		System.out.print("\n대여할 도서 번호를 입력하세요: ");
		int choice = input.nextInt() - 1;
		input.nextLine();
		
		if (choice < 0 || choice >= availableCount) {
			System.out.println("잘못된 번호입니다.");
			return;
		}
		
		int bookIndex = availableIndex[choice];
		System.out.print("대여자 이름: ");
		String borrower = input.nextLine();
		System.out.print("대여자 연락처: ");
		String phone = input.nextLine();
		System.out.print("대여 기간(일): ");
		int period = input.nextInt();
		input.nextLine();
		
		bookArray[bookIndex].rent(borrower, phone, period);
		System.out.println("도서 대여가 완료되었습니다!");
	}

	// 도서 반납
	public static void returnBook() {
		// 대여중인 도서만 표시
		System.out.println("\n=== 대여중인 도서 목록 ===");
		int rentedCount = 0;
		int[] rentedIndex = new int[bookCount];
		
		for (int i = 0; i < bookCount; i++) {
			if (!bookArray[i].isAvailable()) {
				rentedIndex[rentedCount] = i;
				System.out.println((rentedCount + 1) + ". " + bookArray[i].toString());
				rentedCount++;
			}
		}
		
		if (rentedCount == 0) {
			System.out.println("반납할 도서가 없습니다.");
			return;
		}
		
		System.out.print("\n반납할 도서 번호를 입력하세요: ");
		int choice = input.nextInt() - 1;
		input.nextLine();
		
		if (choice < 0 || choice >= rentedCount) {
			System.out.println("잘못된 번호입니다.");
			return;
		}
		
		int bookIndex = rentedIndex[choice];
		bookArray[bookIndex].returnBook();
		System.out.println("도서 반납이 완료되었습니다!");
	}
}