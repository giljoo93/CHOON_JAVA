package dailyStudy._0202_Calendar;

public class Model {

//	윤달, 윤년 계산기
	public static boolean LeapTimeCal(int year) {
		
		boolean isLeap;
		isLeap = (year % 4 == 0 ? 
				 (year % 100 == 0 ? 
				 (year % 400 == 0 ? true : false) // 400으로 나눠 떨어지면 윤년 아니면 평년임
					 			     	 : true)  // 100으로 나눠 떨어지지 않으니 윤년임
										 : false); // 4년이 안되었으니 윤년아님
		
		return isLeap;
	}

// 각 월의 일수가 몇일인지 반환하는 메서드
	public static int daysInMonth(int year, int month) {
		switch (month) {
			case 1,3,5,7,8,10,12 :
				return 31;
			case 2:
				return (LeapTimeCal(year) == true ? 29 : 28);
			case 4,6,9,11:
				return 30;
			default :
				return 0;
		
				 	
		}
	}

//	Position에 대한 리턴 값을 가지는 메서드 

	public static void setMonth(int[] datePositionInMonth, int startPos, int days) {
		
		int drowDays = 1;

		for(int i = 0; i < datePositionInMonth.length; i++) {
			
			datePositionInMonth[i] = 0;
			if (i >= startPos-1 && i < days + startPos-1) {
				datePositionInMonth[i] = drowDays;
				drowDays++;
			}
			
		}


	}

//	캘린더 배열에 데이터를 각각 지정하는 초기 실행 메서드

	public static void setCalender(int[]datePositionInMonth, int[] year, int[] month, int[] days, int[] position) {

		for (int i = 1; i < year.length; i++) {
			month[i] = ((month[i-1] +1) > 12 ? 1 : (month[i-1] +1));
			year[i] = (month[i] == 1 ? year[i-1] +1 : year[i-1]);
			days[i] = daysInMonth(year[i], month[i]);
			// position[i] = setMonth(datePositionInMonth,position[i-1],days[i-1]);
			position[i] = (position[i-1]+days[i-1])%7;
		}

	}


}
