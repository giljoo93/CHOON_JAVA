package dailyStudy._0202_Calendar;

import java.time.LocalDate;

public class Control {
    
//  달력을 만드는 메서드
    public static void Loading(int[] datePositionInMonth, int[] year, int[] month, int[]days, int[] position) {
        View.pushScreen();
        System.out.println("데이터 로딩 중입니다.");
        Model.setCalender(datePositionInMonth, year, month, days, position);
        System.out.println("달력을 모두 완성했습니다.");

    }

//  오늘일자의 달력을 불러오는 메서드
    public static void callByToday (int[] datePositionInMonth, int[] year, int[] month, int[]days, int[] position) {

        LocalDate today = LocalDate.now();
        int whereToday =0;
        int holdYear = Integer.parseInt(
				String.valueOf(today).substring(0, 4));
		int holdMonth = Integer.parseInt(
				String.valueOf(today).substring(5, 7));
		// int holdDay = Integer.parseInt(
		// 		String.valueOf(today).substring(8, 10));

            System.out.println("오늘의 년도 : " + holdYear + " 오늘의 월자 : "+ holdMonth);

        int tempYear;
        int tempMonth;
        for (int i = 0; i < year.length ; i++) {
            tempYear = year[i];
            tempMonth = month[i];
            if(tempYear == holdYear) {
                System.out.println("오늘에 해당하는 년도를 찾았습니다.");
                if(tempMonth == holdMonth) {
                    System.out.println("오늘에 해당하는 월자를 찾았습니다.");
                    whereToday = i;
                }
            }
        }
        int todayYear = year[whereToday];
        int todayMonth = month[whereToday];
        int todayDays = days[whereToday];
        int todayPosition = position[whereToday];

        Model.setPositionInMonth(datePositionInMonth, todayYear, todayMonth, todayDays, todayPosition);
        View.pushScreen();
        View.calendarTop(todayYear, todayMonth);
        View.dateStructure(false, datePositionInMonth);
        View.calendarBottom();

    }

}
