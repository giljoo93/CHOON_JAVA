package dailyStudy._0202_Calendar;

import java.util.Scanner;

public class LeapTimeCal {

//	윤달, 윤년 계산기입니다.
	
	public static boolean LeapTimeCal(int year) {
		
		boolean isLeap;
		isLeap = (year % 4 == 0 ? 
				 (year % 100 == 0 ? 
				 (year % 400 == 0 ? true : false) // 400으로 나눠 떨어지면 윤년 아니면 평년임
					 			     	 : true)  // 100으로 나눠 떨어지지 않으니 윤년임
										 : false); // 4년이 안되었으니 윤년아님
		
		return isLeap;
	}
	
}
