package dailyStudy;

public class Book {
	private String title;		// 책 제목
	private String author;		// 저자명
	private String registerDate;	// 등록일
	private String borrower;	// 대여자명 (null이면 대여 가능)
	private String borrowerPhone; // 대여자 연락처
	private int rentalPeriod;	// 대여기간 (일)
	
	public Book(String title, String author, String registerDate) {
		this.title = title;
		this.author = author;
		this.registerDate = registerDate;
		this.borrower = null;		// 초기값: 대여 가능
		this.borrowerPhone = null;
		this.rentalPeriod = 0;
	}
	
	// Getter 메서드들
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getRegisterDate() {
		return registerDate;
	}
	
	public String getBorrower() {
		return borrower;
	}
	
	public String getBorrowerPhone() {
		return borrowerPhone;
	}
	
	public int getRentalPeriod() {
		return rentalPeriod;
	}
	
	// 대여 가능 여부 확인
	public boolean isAvailable() {
		return borrower == null;
	}
	
	// 도서 대여
	public void rent(String borrower, String borrowerPhone, int rentalPeriod) {
		this.borrower = borrower;
		this.borrowerPhone = borrowerPhone;
		this.rentalPeriod = rentalPeriod;
	}
	
	// 도서 반납
	public void returnBook() {
		this.borrower = null;
		this.borrowerPhone = null;
		this.rentalPeriod = 0;
	}
	
	// 도서 정보 출력
	@Override
	public String toString() {
		if (isAvailable()) {
			return String.format("제목: %s | 저자: %s | 등록일: %s | 상태: 대여가능", 
					title, author, registerDate);
		} else {
			return String.format("제목: %s | 저자: %s | 등록일: %s | 대여자: %s | 연락처: %s | 대여기간: %d일", 
					title, author, registerDate, borrower, borrowerPhone, rentalPeriod);
		}
	}
}
