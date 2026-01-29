package dailyStudy._0129;

public class Launcher {

	public static void main(String[] args) {

		System.out.println("HC에 오신 것을 환영합니다.");

//		guest 객체를 만들어서. >> 접근하게 해야함.

//		Book, 연재 자료 조회, Author (permission 0 , 접근가능) guestUI.java == LS.java
//														LS.java <== Member.java (extends)
		
		
//		LibraryServices.guest.printUI();  //nonstatic 메서드들의 접근
										  //로그인을 해서 permission 있는 객체가 있으면, 
										  //해당 객체로 non-static 메서드 접근하게 해야함.
		
		/*		
		
		>> 게스트 permission > public 개체들을 확인 할 수 있다.
		>> 게스트 ~ 읽을 수 있는 책들이 있다. 5회까지는 게스트도 접근이 된다.
		>> 5회 이상부터는 permission 1, 접근이 된다.
	

		
		>> MemberUI
		
		 */
		
	}
}
