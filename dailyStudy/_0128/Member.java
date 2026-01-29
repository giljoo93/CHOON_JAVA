package dailyStudy._0128;

import java.time.LocalDate;

public class Member {

			  String ID;
			  String PW;
	
			  String name;
			  String number;
			  String email;
	protected String PK;
			  
		   LocalDate regDate;
	
	
	Member() {}
	
//	Sign Up시 호출될 메서드
	Member(String ID, String PW, String name, String number, String email) {
			this.ID = ID;
			this.PW = PW;
		
		  this.name = name;
		this.number = number;
		 this.email = email;
		    this.PK = number + regDate; //임시 PK. 적합하지않으나, 우선은 심플하게 두었음.
		    		
	   this.regDate = LocalDate.now(); 
	}
	
	
}
