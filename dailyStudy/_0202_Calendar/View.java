package dailyStudy._0202_Calendar;

public class View {

// 화면을 초기화하는 메서드
	public static void pushScreen() {
		for(int i = 0; i<50; i++) {
			System.out.println();
		}
	}

// 캘린더의 상단 부분
	public static void calendarTop(int year, int month) {
		System.out.println("===========================");
		System.out.println("  캘린더   " + year + " 년 " + month + " 월");
		System.out.println("---------------------------");
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
	}

// 캘린더의 하단부분
	public static void calendarBottom() {
		System.out.println("===========================");
	}


//	캘린더의 date 구조체
	public static void dateStructure(boolean isHolliday, int[] monthOfDate) {
    
		int calPosition = 0;
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j <7; j++) {
				System.out.print((isHolliday == true     ? "H"  : " "));
				System.out.print(			(monthOfDate[calPosition] == 0 ? "  " : 
		 			 String.valueOf(monthOfDate[calPosition]).length() < 2 ? " " + monthOfDate[calPosition] 
				 								    							  : monthOfDate[calPosition]));
				System.out.print(" ");
				calPosition++;
			}
			System.out.println();
		}

	}
}
