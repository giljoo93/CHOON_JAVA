package dailyStudy._0202_Calendar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Model {

	final static int CALENDAR_SIZE = 2000;
	final static int MONTH_SIZE = 42;
	
	int[] year = new int[CALENDAR_SIZE];
	int[] month = new int[CALENDAR_SIZE];
	int[] days = new int[CALENDAR_SIZE];
	int[] position = new int[CALENDAR_SIZE];
	boolean[] holiday = new boolean[MONTH_SIZE];
	int[] datePositionInMonth = new int[MONTH_SIZE];
	
	String[] holidays = new String[100];
	
	
	int screen;
	
	Model() {
		
		this.year[0] = 1960;
		this.month[0] = 1;
		this.days[0] = 31;
		this.position[0] = 6;
	}
	
	
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
			position[i] = ((position[i-1]+days[i-1])%7 == 0 ? 7 : (position[i-1]+days[i-1])%7);
		}

	}
	
//	배열을 찾아주는 검색 메서드
	public static int findArray(int[] year, int[] month, int dateYMD) {
		
        int holdYear = Integer.parseInt(
				String.valueOf(dateYMD).substring(0, 4));
		int holdMonth = Integer.parseInt(
				String.valueOf(dateYMD).substring(4, 6));
		
		
		int tempYear;
	    int tempMonth;
	        for (int i = 0; i < year.length ; i++) {
	            tempYear = year[i];
	            tempMonth = month[i];
	            
	            if(tempYear == holdYear && tempMonth == holdMonth) {
	                
	                
	                
	                return i;
	                }
	        }
	return 0;
	}
	
//	배열을 찾아주는 검색 메서드
	public static void findholiday(int[] year, 
								   int[] month, 
								   int[] datePositionInMonth, 
								   boolean[] holiday, 
								   String[] holidays) {
		int holdYear;
		int holdMonth;
		int holdDay;
		
		int n = 0;
		
		for(int i = 0; i <MONTH_SIZE; i++) {
			if (datePositionInMonth[i] == 1) {
				n=i;
				break;
			}
		}
		
		
		for(int i=0; i<holiday.length; i++) {
		
			for(int j=0; j<holidays.length; j++) {
				
				holdYear = Integer.parseInt(holidays[i].substring(0, 4));
				holdMonth = Integer.parseInt(holidays[i].substring(4, 6));
				holdDay = Integer.parseInt(holidays[i].substring(6, 8));
				
				for(int k=0; k<CALENDAR_SIZE; k++) {
					
					if(holdYear == 0000) {
						
						if (holdMonth == month[k] && 
							holdDay == datePositionInMonth[n+k]) {
							
							holiday[i] = true;
							
						}else { 
							holiday[i] = false;
						}
					}else if(holdYear == year[k] && 
							 holdMonth == month[k] && 
							 holdDay == datePositionInMonth[n+k]) {
						
							holiday[i] = true;
						}else {
							holiday[i] = false;
						}
					
				}
																
			}
							
		}
	
	}

//	공휴일을 불러오는 FileReader 가 있는 메서드
	public void holidayReader() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("holiday.txt"));
				
		int i =0;
		
		for (String line = br.readLine(); line != null; line = br.readLine()) {
		
		holidays[i] = line;
			
		i++;
			
		}
		
		br.close();
	}
	
}
