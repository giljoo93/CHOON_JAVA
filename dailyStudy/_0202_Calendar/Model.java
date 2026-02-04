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

//	startPos 파라미터로 시작위치로 배열을 잡고 startPos를 또 반환하는 메서드

	public static int setMonth(int[] datePositionInMonth, int startPos, int year, int month, int days) {
		int emptyDays = 0;
		int drowDays = 1;

		for(int i = 0; i < datePositionInMonth.length; i++) {
			
			datePositionInMonth[i] = 0;
			if (i >= startPos-1 && i < days + startPos-1) {
				datePositionInMonth[i] = drowDays;
				drowDays++;
			}else{
				emptyDays++;
			}
		}

		int nextPos = (7-(emptyDays % 7)==0 ? 1 : 8-(emptyDays % 7) );

		return nextPos;
	}

//	캘린더 배열에 데이터를 각각 지정하는 초기 실행 메서드

	public static void setCalender(int[]datePositionInMonth, int[] year, int[] month, int[] days, int[] position) {

		for (int i = 1; i < year.length; i++) {
			month[i] = ((month[i-1] +1) > 12 ? 1 : (month[i-1] +1));
			year[i] = (month[i] == 1 ? year[i-1] +1 : year[i-1]);
			days[i] = daysInMonth(year[i], month[i]);
			position[i] = setMonth(datePositionInMonth,position[i-1],year[i-1],month[i-1],days[i-1]);
		}

	}


//	배열을 읽어서 datePositionInMonth 를 지정하는 메서드

	public static void setPositionInMonth (int[] datePositionInMonth, int year, int month, int days, int position) {
	
		int drowDays = 1;

		for(int i = 0; i < datePositionInMonth.length; i++) {
			
			datePositionInMonth[i] = 0;
			if (i >= position-1 && i < days + position-1) {
				datePositionInMonth[i] = drowDays;
				drowDays++;
			}
		}
	}

}
