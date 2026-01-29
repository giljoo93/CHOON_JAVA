package dailyStudy._0129;

import java.time.LocalDate;

//guest permission 으로 접근 가능한 기능들
public class LibraryServices {

// 기능 모음 클래스 되어야 할 것 같다.
	
// 도서조회, 연재 자료 조회, 작가 정보 조회
	
// 어떤 기능들이 필요한가.
	
	public void mainPage() {
		
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
//		System.out.println(basic.mainStatus != null ? "System : " + basic.mainStatus : "System : 방문을 환영합니다.");
		System.out.println("----------------------------");
		System.out.print(">");
	}
	
	
	public static void setUniqueKey() {
		
		LocalDate today = LocalDate.now();
//		int[]  = new int[1000];
		
		Integer randomNumber = (int)(Math.random())*1000;
		String  dayAndDate   = LocalDate.now().getMonth() +""+ LocalDate.now().getDayOfMonth();
//		String dayCount = if(today == )
	}
	
}

