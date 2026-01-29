package dailyStudy._0129._Member;

import java.time.LocalDate;

// 기본 회원 클래스
public class Member {

	String ID;
	String password;
	String email;
	LocalDate regDate;
	
	
	String uniqueKey;
	
	short cash;
	String buyList;
	
	byte permission;
	
	
	
	Member() {

		this.ID = ID;
		this.password = password;
		this.email = email;
		
//		this.uniqueKey = uniqueKey; 날자(00) + 랜덤번호(000) + 날자에 대한 Idx(0000)
		
		this.cash = 0;
		this.buyList = null;
		
		this.permission = 1;
		
	}
	
	
	
	
	
}
