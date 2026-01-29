package dailyStudy._0129;

import java.time.LocalDate;

public class Book {

//	Enum이란 것사용하면, 무결성측면에서 좋다함.
	
	
	
	short uniqueKey;   //작품 고유순번 : 고객이 알 필요는 없다. 		permission = 3(admin)
	
	String title;	   //작품 제목명	: 고객이 알아야 한다.		permission = 0[모두공개]
	String author;	   //등록 작가명	: 고객이 알아야 한다.		permission = 0[모두공개]
	String genre;	   //작품 카테고리 : 고객이 알아야 한다.		permission = 0[모두공개]
	LocalDate regDate; //작품 등록일	: 고객이 알아야 한다.		permission = 0[모두공개]
	String Serialized; //연재중인지에 대한 정보 = 완결/연재중/휴재중  permission = 0[모두공개] 
	
	
	
	
	
	
	short price; // 작품 구매가격 : permission = 0[모두공개]
	
	
	
}
